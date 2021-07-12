package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * @author F.Brico
 */
public class AnalyticsCounter {
	
	/**
	 * Main Program
	 * it takes a list of symptoms from one file and writes the number of occurrences for each of them to another.
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		
		//STEP1 : Read the input file by integrating it into a list
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listSymptoms = readSymptomDataFromFile.GetSymptoms();
		
		//STEP2: Create a map containing the occurrences of each symptom of the list
		OccurrenceSymptomMapping occurrenceSymptomMapping = new OccurrenceSymptomMapping();
		Map<String, Integer> mapSymptoms = occurrenceSymptomMapping.conversion(listSymptoms);
		
		//STEP3: Write the map to the output file
		WriteMapInFile writeMapInFile = new WriteMapInFile();
		writeMapInFile.writeInFile(mapSymptoms,"result.out");
	}
}


