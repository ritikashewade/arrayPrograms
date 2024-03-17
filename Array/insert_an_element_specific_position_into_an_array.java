//Write a Java program to insert an element (specific position) into an array.

package Array;

import java.util.ArrayList;

public class insert_an_element_specific_position_into_an_array {
public static void main(String[] args) {
	int a[]= {50,30,20,60,10};
	ArrayList ref = new ArrayList();
	for(Object obj : a)
	{
		ref.add(obj);
	}
	ref.add(2, 55);
	System.out.println(ref);
}
}
