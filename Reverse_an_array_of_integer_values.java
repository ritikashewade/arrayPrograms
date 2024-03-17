package arrayProg;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_an_array_of_integer_values {
	public static void main(String[] args) {
		int a[]= {4,5,2,6,3};
		ArrayList<Integer> ref = new ArrayList();
		for(Integer i : a) {
			ref.add(i);
		}
		System.out.println(ref);
		System.out.println(ref.reversed());

	}
}
