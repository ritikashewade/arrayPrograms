//Calculate the average value of array elements

package Array;

public class Calculate_the_average_value_of_array_elements {
public static void main(String[] args) {
	int a[]= {10,30,40,-40,70};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	int avg = sum / a.length;
	System.out.println(avg);
}
}
