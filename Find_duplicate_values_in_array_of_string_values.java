package arrayProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Find_duplicate_values_in_array_of_string_values {
	public static void main(String[] args) {
		String a[]= {"abc","xyz","pqr","xyz","jkl"};
		ArrayList<String> ref = new ArrayList();
		for(String s : a) {
			ref.add(s);
		}
		System.out.println(ref);
		
		TreeMap<String,Integer> ref1 = new TreeMap();
		for(String s1 : ref) {
			int count=Collections.frequency(ref, s1);
			ref1.put(s1, count);
		}
		System.out.println(ref1);
		
		Set<Entry<String, Integer>> set = ref1.entrySet();
		
		TreeMap ref2 = new TreeMap();
		for(Entry es: set) {
			if(es.getValue().equals(2)) {
				ref2.put(es.getKey(), es.getValue());
			}
		}
		System.out.println(ref2);
	}
}
