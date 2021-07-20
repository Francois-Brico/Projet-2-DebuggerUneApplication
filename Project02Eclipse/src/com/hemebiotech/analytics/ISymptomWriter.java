package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * @author F.Brico
 */
public interface ISymptomWriter {

	/**
	 * Transfer a map in a file
	 * 
	 * @param mapSymptoms : Map that contains the symptoms and their respective
	 *                    occurrence
	 * @param fileOut     : Result destination file
	 * @throws IOException 
	 */
	void writeInFile(Map<String, Integer> mapSymptoms, String fileOut) throws IOException;
}
