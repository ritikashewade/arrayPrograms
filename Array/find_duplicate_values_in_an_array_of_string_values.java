//Write a Java program to find duplicate values in an array of string values.

package Array;

public class find_duplicate_values_in_an_array_of_string_values {
	public static void main(String[] args) {
		String a[]= {"Hi","Bye","Hello","Bye","Welcome","Hi"};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println(a[j]);
				}
			}
		}
	}
}
