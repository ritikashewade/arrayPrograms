package arrayProg;

import java.util.Arrays;
import java.util.TreeSet;

public class To_find_common_ele_between2int_arrays {
	public static void main(String[] args) {
		int a[]= {4,3,2,6,1,9};
		int b[]= {3,2,7,8,5};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		TreeSet ref = new TreeSet();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					ref.add(a[i]);
				}
			}
		}
		System.out.println(ref);
	}
}
