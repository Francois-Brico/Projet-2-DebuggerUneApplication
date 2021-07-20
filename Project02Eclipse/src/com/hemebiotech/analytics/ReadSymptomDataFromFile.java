package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Create a list from a file
	 * 
	 * @throws IOException
	 */
	@Override
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("Problem encountered while reading the file");

			} finally {
				reader.close();
			}
		}
		return result;
	}
}
