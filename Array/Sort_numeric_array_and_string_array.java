//Sort a numeric array and a string array

package Array;

import java.util.Arrays;

public class Sort_numeric_array_and_string_array {
	public static void main(String[] args) {
		int num[] = new int[5];
		num[0]=10;
		num[1]=40;
		num[2]=60;
		num[3]=20;
		num[4]=30;
		
		String str[] = new String[5];
		str[0]="Hello";
		str[1]="Bye";
		str[2]="Come";
		str[3]="Welcome";
		str[4]="Start";
		
		Arrays.sort(num);
		
		Arrays.sort(str);
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.deepToString(str));
	}
}
