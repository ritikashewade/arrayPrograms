//Write a Java program to find the second largest element in an array.
package Array;

import java.util.Arrays;

public class find_the_second_largest_element_in_an_array {
public static void main(String[] args) {
	int a[]= {10,40,20,60,70,30,90};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(a[a.length-2]);
}
}
