package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class find_the_maximum_and_minimum_value_of_an_array {
	public static void main(String[] args) {
		int a[]= {40,10,20,50,70};
		ArrayList ref = new ArrayList();
		for(Object obj: a)
		{
			ref.add(obj);
		}
		System.out.println(ref);
		Collections.sort(ref);
		System.out.println(ref);
		System.out.println("min: "+ref.getFirst());
		System.out.println("max: "+ref.getLast());
	}
}
