package arrayProg;

import java.util.Arrays;

public class Find_max_min_value_of_array {

	public static void main(String[] args) {
		findMaxMin();	
	}
	public static void findMaxMin() {
		int a[]= {4,2,7,5,3};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("max: "+a[0]);
		System.out.println("min: "+a[a.length-1]);
		
	}
}

