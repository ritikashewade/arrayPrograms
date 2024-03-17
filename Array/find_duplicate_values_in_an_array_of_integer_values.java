//Write a Java program to find duplicate values in an array of integer values
package Array;

public class find_duplicate_values_in_an_array_of_integer_values {
	public static void main(String[] args) {
		int a[]= {30,10,70,30,20,10};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}
}
