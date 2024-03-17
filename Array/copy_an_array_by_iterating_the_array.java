//Write a Java program to copy an array by iterating the array.

package Array;

import java.util.Arrays;

public class copy_an_array_by_iterating_the_array {
	public static void main(String[] args) {
		int a[]= {40,20,10,50};
		System.out.println("a: "+Arrays.toString(a));
		int b[]= new int[4];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		}
		System.out.println("b: "+Arrays.toString(b));
		
	}
}
