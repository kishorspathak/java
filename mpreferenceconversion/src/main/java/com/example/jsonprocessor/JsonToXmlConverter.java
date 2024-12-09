package com.example.jsonprocessor;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

import java.io.File;

public class JsonToXmlConverter {

    public static void main(String[] args) throws Exception {
        // Load JSON
        String jsonFilePath = "C:\\dev\\input-reference-rmp-fields.json"; // Replace with your JSON file path
        JSONObject jsonObject = new JSONObject(new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(jsonFilePath))));
        JSONArray interviewValues = jsonObject.getJSONArray("interview_values");

        // Create XML document
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        // Root element
        Element rootElement = doc.createElement("AnswerSet");
        rootElement.setAttribute("title", "");
        rootElement.setAttribute("version", "1.1");
        doc.appendChild(rootElement);

        // Process each connector
        for (int i = 0; i < interviewValues.length(); i++) {
            JSONObject connector = interviewValues.getJSONObject(i);
            String name = connector.getString("connector");
            Object value = connector.get("value");

            // Create Answer element
            Element answer = doc.createElement("Answer");
            answer.setAttribute("name", name);
            rootElement.appendChild(answer);

            if (value instanceof JSONArray) {
                // Handle array values
                Element rptValue = doc.createElement("RptValue");
                answer.appendChild(rptValue);

                for (Object v : (JSONArray) value) {
                    String tag = determineTag(name);
                    createValueElement(doc, rptValue, tag, v);
                }
            } else {
                // Handle single values
                String tag = determineTag(name);
                createValueElement(doc, answer, tag, value);
            }
        }

        // Write XML to file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("C:\\dev\\output.xml")); // Replace with your desired output file
        transformer.transform(source, result);

        System.out.println("XML file created successfully!");
    }

    private static void createValueElement(Document doc, Element parent, String tagName, Object value) {
        Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(value.toString()));
        parent.appendChild(element);
    }

    private static String determineTag(String connectorName) {
        if (connectorName.endsWith("Tf")) return "TFValue";
        if (connectorName.endsWith("Dte")) return "DateValue";
        if (connectorName.endsWith("Mc")) return "MCValue";
        if (connectorName.endsWith("Num")) return "NumValue";
        if (connectorName.endsWith("Txt")) return "TextValue";
        return "TextValue"; // Default tag
    }
}
