//Write a Java program to test two arrays' equality.

package Array;

public class test_two_arrays_equality {
	public static void main(String[] args) {
		int a[]= {1,3,5,7};
		int b[]= {1,3,6,7};
		int c[]= {1,3,5,7};
		equality(a,b);
		equality(a, c);
	}
	public static void equality(int x[],int y[]) {		
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					count++;
				}
			}
		}
		if(count!=0)
		{
			System.out.println("two arrays are equal");
			
		}
		else
		{
			System.out.println("two arrays are not equal");
		}
		 
	}
}

//doubt