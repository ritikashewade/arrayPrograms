//Write a Java program to find a missing number in an array.

package Array;

public class find_missing_number_in_an_array {
	public static void main(String[] args) {
		int len=7;
		int n[]= {1,2,3,4,5,7};
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				if(i==n[j])
				{
					break;
				}
				
				
			}
			System.out.println(i);
		}
	}
}
