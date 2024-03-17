//Write a Java program to remove a specific element from an array.

package Array;

import java.util.ArrayList;

public class remove_specific_element_from_an_array {
public static void main(String[] args) {
	int a[]= {40,29,59,24,57};
	ArrayList ref = new ArrayList();
	for(Object obj: a)
	{
		ref.add(obj);
	}
	System.out.println(ref);
	ref.remove(3);
	System.out.println(ref);
}
}
