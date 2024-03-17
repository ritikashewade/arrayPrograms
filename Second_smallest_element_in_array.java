package arrayProg;

import java.util.Arrays;

public class Second_smallest_element_in_array {
	public static void main(String[] args) {
		int a[]= {3,5,7,2,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int secLast = a[1];
		System.out.println(secLast);
		
	}
}
