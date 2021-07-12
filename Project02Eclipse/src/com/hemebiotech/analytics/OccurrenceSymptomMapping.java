package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author F.Brico
 */
public class OccurrenceSymptomMapping {

	/**
	 * Convert a symptom list to a map with number of times each symptoms has been
	 * written
	 * 
	 * @param listEntry : list of symptoms to filter with occurrences
	 * @return map of iteration of symptoms with their occurrences
	 */
	public Map<String, Integer> conversion(List<String> listEntry) {
		Map<String, Integer> mapOccurrence = new TreeMap<String, Integer>();

		for (int i = 0; i < listEntry.size(); i++) {
			// case 1 : i never seen this symptom
			if (mapOccurrence.get(listEntry.get(i)) == null) {
				mapOccurrence.put(listEntry.get(i), 1);
				System.out.println("NEW: " + listEntry.get(i) + "(1)");
			}
			// case 2: symptom ever exist in map
			else {
				mapOccurrence.put(listEntry.get(i), mapOccurrence.get(listEntry.get(i)) + 1);
				System.out.println("Increment: " + listEntry.get(i) + " = " + mapOccurrence.get(listEntry.get(i)));
			}
		}
		return mapOccurrence;
	}
}
