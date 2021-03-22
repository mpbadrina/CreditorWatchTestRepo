package com.common.utilities;

import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonReader {
	private static final Logger log = LogManager.getLogger("JsonParser");

	public static JsonArray getJsonArrayFromFile(String filePath) {
		JsonArray jsonObject = (JsonArray) readJsonFile(filePath);
		return jsonObject;
	}

	public static JsonElement readJsonFile(String filename) {
		JsonElement jsonElement = null;
		try {
			FileReader reader = new FileReader(filename);
			jsonElement = JsonParser.parseReader(reader);
		} catch (IOException e) {
			log.error("Unable to open file.", e);
		}
		return jsonElement;
	}

}
