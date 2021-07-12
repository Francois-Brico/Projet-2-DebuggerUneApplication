package com.hemebiotech.analytics;

import java.util.Map;
/**
 * @author F.Brico
 */
public interface ISymptomWriter {
	
	/**
	 * Transfer a map in a file
	 * @param mapSymptoms : Map that contains the symptoms and their respective occurrence
	 * @param fileOut : Result destination file
	 */
	void writeInFile(Map<String, Integer> mapSymptoms, String fileOut);
}
