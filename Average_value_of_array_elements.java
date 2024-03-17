package arrayProg;

public class Average_value_of_array_elements {
	public static void main(String[] args) {
		int a[]= {1,4,7,9};
		float sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
//		System.out.println(sum);
		float avg=sum/a.length;
		System.out.println(avg);
	}
}
