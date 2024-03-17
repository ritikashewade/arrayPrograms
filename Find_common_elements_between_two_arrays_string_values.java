package arrayProg;
import java.util.Arrays;
import java.util.HashSet;

public class Find_common_elements_between_two_arrays_string_values {
	public static void main(String[] args) {
		String a[]= {"xyz","abc","pqr"};
		String b[]= {"mno","str","abc"};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		HashSet ref = new HashSet();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i].equals(b[j])) {
					ref.add(a[i]);
				}
			}
		}
		System.out.println(ref);
		
	}
}
