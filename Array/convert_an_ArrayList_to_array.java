//Write a Java program to convert an ArrayList to an array.

package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class convert_an_ArrayList_to_array {
	public static void main(String[] args) {
		ArrayList<Integer> ref = new ArrayList<Integer>();
		ref.add(40);
		ref.add(50);
		ref.add(10);
		ref.add(60);
		Object a[]=ref.toArray();
		System.out.println(Arrays.toString(a));
		
		
		
	}
}
