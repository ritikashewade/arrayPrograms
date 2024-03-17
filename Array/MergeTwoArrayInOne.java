package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeTwoArrayInOne {
	public static void main(String[] args) {
		  int[]a = {10,20,30};
	      int[]b = {40,50,60};
	      int len = a.length+b.length;
	      int[]c = new int[len];
	     
	      for(int i = 0; i < a.length; i++) { 
	         c[i] = a[i];
	        
	      } 
	      for(int j = 0; j < b.length;j++) { 
	         c[a.length+j] = b[j];
	      }
	      
	      for(int i = 0;i < c.length;i++) { 
	    	  System.out.print(c[i]+" ");
	      }
		
	}
}














//
//int a[]= {10,20,30};
//int b[]= {40,50,60};
//int c[]= {};
//ArrayList ref = new ArrayList();		
//for(Object obj1 : a)
//{
//	ref.add(obj1);
//}
//for(Object obj2 : b)
//{
//	ref.add(obj2);
//}		
//Object[] x = ref.toArray();
//for(int i=0;i<x.length;i++)
//{
//	System.out.print(x[i]+" ");
//}