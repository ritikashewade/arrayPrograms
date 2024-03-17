//Write a Java program to find common elements between two arrays (string values)

package Array;

public class find_common_elements_between_two_arrays_string_values {
public static void main(String[] args) {
	String str1[] = {"Jack","Smith","Allen","Rosy"};
	String str2[] = {"Wicky","Jhoseph","Allen","Jack"};
	for(int i=0;i<str1.length;i++)
	{
		for(int j=0;j<str2.length;j++)
		{
			if(str1[i].equals(str2[j]))
			{
				System.out.println(str1[i]);
			}
		}
	}
}
}
