//Write a Java program to reverse an array of integer values.

package Array;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_an_array_of_integer_values {
public static void main(String[] args) {
	int a[]= {30,20,50,60,80,10};
	ArrayList ref= new ArrayList();
	for(Object obj : a)
	{
		ref.add(obj);
	}
	System.out.println(ref);
	Collections.reverse(ref);
	System.out.println(ref);
}
}
