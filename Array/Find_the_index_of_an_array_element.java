//Find the index of an array element

package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_the_index_of_an_array_element {
public static void main(String[] args) {
	int a[]= {40,20,30,10,50};
	ArrayList ref= new ArrayList();
	for(Object obj:a)
	{
		ref.add(obj);
	}
	System.out.println(ref);
	System.out.println(ref.indexOf(30));
}
}
