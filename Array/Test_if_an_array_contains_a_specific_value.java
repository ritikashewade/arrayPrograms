//Test if an array contains a specific value

package Array;

public class Test_if_an_array_contains_a_specific_value {
	public static void main(String[] args) {
		int a[]= {2000,1987,4039,2495,7069,3950};
		int item=1987;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(item==a[i])
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
