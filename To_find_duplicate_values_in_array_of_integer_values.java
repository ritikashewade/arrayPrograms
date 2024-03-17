package arrayProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class To_find_duplicate_values_in_array_of_integer_values {
	public static void main(String[] args) {
		int a[]= {50,30,20,10,30,10};
		ArrayList ref = new ArrayList();
		for(Integer i : a) {
			ref.add(i);
		}
		System.out.println(ref);
		TreeMap ref1= new TreeMap();
		for(Object i1 : ref) {
			int count=Collections.frequency(ref, i1);
			ref1.put(i1, count);
		}
		System.out.println(ref1);
		TreeMap ref2 = new TreeMap();
		Set<Entry> set = ref1.entrySet();
		for(Entry e : set) {
			if(e.getValue().equals(2)) {
				ref2.put(e.getKey(), e.getValue());
			}
		}
		System.out.println(ref2);
		
	}
}
