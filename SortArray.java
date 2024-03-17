package arrayProg;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
//		sortNum();
		sortString();
	}
	
	public static void sortString() {
		String str[]= {"xyz","pqr","abc","def"};
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+"  ");
		}
		Arrays.sort(str);
		System.out.println();
		for(int j=0;j<str.length;j++)
		{
			System.out.print(str[j]+"  ");
		}
		System.out.println();
//		reverse
		for(int k=str.length-1;k>=0;k--)
		{
			System.out.print(str[k]+"  ");
		}
		
	}
	
	public static void sortNum() {
		int a[]= {2,6,1,9,3};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
//		used sort() of Arrays class
		Arrays.sort(a);
		System.out.println();
//		printed sorted array
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+"  ");
		}
		System.out.println();
		
//		reverse
		for(int k=a.length-1;k>=0;k--)
		{
			System.out.print(a[k]+"  ");
		}
	}
}
