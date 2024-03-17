//Write a Java program to convert an array to an ArrayList.

package Array;

import java.util.ArrayList;

public class convert_an_array_to_an_ArrayList {
	public static void main(String[] args) {
		int a[]= {4,2,6,7,3,2,1};
		ArrayList ref = new ArrayList();
		for(Object obj : a)
		{
			ref.add(obj);
		}
		System.out.println(ref);
	}
}
