package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author F.Brico
 */
public class WriteMapInFile {

	/**
	 * Transfer a map in a file
	 * @param mapSymptoms : Map that contains the symptoms and their respective occurrence
	 * @param fileOut : Result destination file
	 */
	public void writeInFile(Map<String, Integer> mapSymptoms, String fileOut) {
		
		try {
			FileWriter writer = new FileWriter(fileOut);
			for (Iterator<Entry<String, Integer>> iterator = mapSymptoms.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, Integer> mapentry = iterator.next();
				writer.write(mapentry.getKey()+" : "+mapentry.getValue()+"\n");
			}
			writer.close();
		}catch (IOException e) {
			System.out.println("Problem encountered while writing the file");
		}
	}
}
