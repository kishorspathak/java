package com.example.jsonprocessor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JsonProcessor {

    public static void main(String[] args) {
        // Define input and output file paths
        String inputFilePath = "C:\\dev\\input-reference-rmp-fields.json";
        String outputFilePath = "C:\\dev\\modified-reference.json";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read JSON from file
            JsonNode rootNode = objectMapper.readTree(new File(inputFilePath));

            // Create a new root node
            ObjectNode newRoot = objectMapper.createObjectNode();

            // Extract and process interview_values
            ArrayNode interviewValues = (ArrayNode) rootNode.path("interview_values");
            ArrayNode modifiedInterviewValues = objectMapper.createArrayNode();

            for (JsonNode valueNode : interviewValues) {
                ObjectNode newValueNode = objectMapper.createObjectNode();
                newValueNode.set("connector", valueNode.get("connector"));
                newValueNode.set("value", valueNode.get("value"));
                modifiedInterviewValues.add(newValueNode);
            }

            // Add processed interview_values to the new root node
            newRoot.set("interview_values", modifiedInterviewValues);

            // Write the modified JSON to the output file
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFilePath), newRoot);

            System.out.println("Modified JSON written to: " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error processing JSON file: " + e.getMessage());
        }
    }
}

