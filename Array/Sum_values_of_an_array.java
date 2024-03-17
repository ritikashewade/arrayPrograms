//Sum values of an array

package Array;

public class Sum_values_of_an_array {
public static void main(String[] args) {
	int a[]= {10,70,40,20};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}

