package arrayProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class To_remove_duplicate_ele_from_array {
	public static void main(String[] args) {
		int a[]= {1,5,3,6,3,5,7,3};
		
		ArrayList<Integer> ref =new ArrayList();
		for(Integer i : a) {
			ref.add(i);
		}
		System.out.println(ref);
		TreeSet<Integer> set = new TreeSet();
		for(Integer i1 : a) {
			set.add(i1);
		}
		System.out.println(set);
	}
}
