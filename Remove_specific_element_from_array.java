package arrayProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_specific_element_from_array {
	public static void main(String[] args) {
		secondWay();
	}
	
	public static void secondWay() {
		int a[]= {1,4,8,9};
		System.out.println(Arrays.toString(a));
	
		ArrayList<Integer> ref = new ArrayList();
		for(Integer i : a)
		{
			ref.add(i);
		}
		System.out.println(ref.remove(1));
		System.out.println(ref);
	}
	
	
	public static void firstWay() {
		int a[]= {1,4,6,8,3};
		System.out.println(Arrays.toString(a));
		int remove=6;
		System.out.println();
		
		int b[]=new int[a.length-1];
		for(int i=0,k=0;i<a.length;i++)
		{
			if(a[i]!=remove)
			{
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		
	}
}
