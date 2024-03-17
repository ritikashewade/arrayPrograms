//Write a Java program to remove duplicate elements from an array.

package Array;

import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicate_elements_from_an_array {
	public static void main(String[] args) {
		int a[]= {40,10,5,20,11,10,40};
		System.out.println(Arrays.toString(a));
		HashSet ref = new HashSet();
		for(Object obj : a)
		{
			ref.add(obj);
		}
		System.out.println(ref);
	}
}
