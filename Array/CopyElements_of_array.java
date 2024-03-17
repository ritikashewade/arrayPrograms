//) Java Program to copy all elements of one array into another array

package Array;

import java.util.Scanner;

public class CopyElements_of_array {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]= new int[5];			//array 'a' of int type is of size 5
		int b[]= new int[a.length];		//array 'b' of int type is also of same size as that of array 'a'
		
		System.out.println("Enter an element of an array of size "+a.length+" (a[]):-");
		for(int k=0;k<a.length;k++)		//using loop taking input of elements of array 'a'
		{
			a[k]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)		//using loop assigning values of array 'a' to array 'b'
		{
			b[i]=a[i];
		}
		for(int j=0;j<a.length;j++)		//using loop printing values of element of array 'b'
		{
			System.out.println("b["+j+"]= "+b[j]);
		}
	}
}
