package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author F.Brico
 */
public class WriteMapInFile implements ISymptomWriter {

	/**
	 * Transfer a map in a file
	 * 
	 * @param mapSymptoms : Map that contains the symptoms and their respective
	 *                    occurrence
	 * @param fileOut     : Result destination file
	 * @throws IOException 
	 */
	public void writeInFile(Map<String, Integer> mapSymptoms, String fileOut) throws IOException {

		FileWriter writer = null;
		try {
			writer = new FileWriter(fileOut);
			for (Iterator<Entry<String, Integer>> iterator = mapSymptoms.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, Integer> mapentry = iterator.next();
				writer.write(mapentry.getKey() + " : " + mapentry.getValue() + "\n");
			}

		} catch (IOException e) {
			System.out.println("Problem encountered while writing the file");
		} finally {
			writer.close();
		}
	}
}
