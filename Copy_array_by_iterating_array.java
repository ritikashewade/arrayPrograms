package arrayProg;

import java.util.ArrayList;
import java.util.Arrays;

public class Copy_array_by_iterating_array {
	public static void main(String[] args) {
		mergeTwoArry();
	}
	
	public static void mergeTwoArry() {
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		ArrayList<Integer> ref = new ArrayList();
		for(Integer i : a) {
			ref.add(i);
		}
		for(Integer i : b) {
			ref.add(i);
		}
		System.out.println(ref);
	}
	
	public static void copyArr() {
		int a[]= {1,6,3,9};
		System.out.println(Arrays.toString(a));
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
