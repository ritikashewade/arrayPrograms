//Write a Java program to find common elements between two integer arrays.

package Array;

public class find_common_elements_between_two_integer_arrays {
	public static void main(String[] args) {
		int a[]= {10,40,20,60,70};
		int b[]= {50,20,80,10,40};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
