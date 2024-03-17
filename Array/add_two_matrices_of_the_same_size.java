// Write a Java program to add two matrices of the same size.

package Array;

import java.util.Arrays;

public class add_two_matrices_of_the_same_size {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{5,6,7},{2,4,1}};
		int b[][]= {{4,3,6},{2,7,8},{4,8,6}};
		
		int sum[][]= new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
	
	
	}
}
