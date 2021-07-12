package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

	// STEP 1 : Read the file

		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		// Read 1rst line (initialize reader)
		String textOnLine = reader.readLine();
		
	//STEP 2 : Create Map occurrence
		Map<String,Integer> mapCounter = new TreeMap<String,Integer>();
		while (textOnLine != null) {
			//case 1 : i never seen this symptom
			if (mapCounter.get(textOnLine) == null) {
				mapCounter.put(textOnLine, 1);
				System.out.println("NEW: "+textOnLine+"(1)");
			}
			//case 2: symptom ever exist in map
			else {
				mapCounter.put(textOnLine, mapCounter.get(textOnLine)+1);
				System.out.println("Increment: "+textOnLine+" = "+mapCounter.get(textOnLine));
			}
			// Read next line 
			textOnLine = reader.readLine();
		}
		reader.close();
		
		// STEP 3 : Write the map in file
		FileWriter writer = new FileWriter("result.out");
		for (Map.Entry mapentry : mapCounter.entrySet()) {
			writer.write(mapentry.getKey() + " : " + mapentry.getValue()+ "\n");
		}
		writer.close();

	}
}
