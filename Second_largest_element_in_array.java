package arrayProg;

import java.util.*;
import java.util.Arrays;

public class Second_largest_element_in_array {
	public static void main(String[] args) {
		int a[]= {3,5,7,2,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int secLast = a[a.length-2];
		System.out.println(secLast);
		
	}
}
