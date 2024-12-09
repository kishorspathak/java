package com.example.jsonprocessor;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXmlAndJsonConverter {

    public static void main(String[] args) throws Exception {
        // Load Input MP Reference JSON File
    	String mpRefJsonFilePath = "C:\\dev\\input-reference-rmp-fields.json";
        JSONObject jsonObject = new JSONObject(new String(Files.readAllBytes(Paths.get(mpRefJsonFilePath))));
        JSONArray interviewValues = jsonObject.getJSONArray("interview_values");
    	
        // Desired XML & JSON output file path
        String mpInterviewValsXmlFilePath = "C:\\dev\\output-mp-reference-to-rmp.xml"; 
        String mpInterviewValsJsonFilePath = "C:\\dev\\output-mp-reference-interview-only.json";
        
        // Create XML document
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        // Root element for XML
        Element rootElement = doc.createElement("AnswerSet");
        rootElement.setAttribute("title", "");
        rootElement.setAttribute("version", "1.1");
        doc.appendChild(rootElement);

        // Create new JSON object for filtered JSON
        JSONObject filteredJson = new JSONObject();
        JSONArray filteredInterviewValues = new JSONArray();

        // Process each connector
        for (int i = 0; i < interviewValues.length(); i++) {
            JSONObject connector = interviewValues.getJSONObject(i);

            // Filter JSON fields for the new JSON file
            JSONObject filteredConnector = new JSONObject();
            filteredConnector.put("connector", connector.getString("connector"));
            filteredConnector.put("value", connector.get("value"));
            filteredInterviewValues.put(filteredConnector);

            // Create Answer element for XML
            String name = connector.getString("connector");
            Object value = connector.get("value");

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

        // Add filtered interview values to the new JSON
        filteredJson.put("interview_values", filteredInterviewValues);

        // Write pretty-formatted XML to file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        DOMSource source = new DOMSource(doc);
        StreamResult xmlResult = new StreamResult(new File(mpInterviewValsXmlFilePath)); // XML output file
        transformer.transform(source, xmlResult);

        // Write pretty-formatted JSON to file
        Files.write(Paths.get(mpInterviewValsJsonFilePath), filteredJson.toString(4).getBytes()); // JSON output file

        System.out.println("Pretty formatted XML and JSON files created successfully!");
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
