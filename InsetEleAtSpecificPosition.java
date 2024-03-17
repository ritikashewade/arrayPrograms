package arrayProg;

import java.util.Arrays;

public class InsetEleAtSpecificPosition {
	public static void main(String[] args) {
		int a[]= {3,6,8,2,4};
		for(int i=0;i<a.length-1;i++) {
			if(i==2) {
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
//		insert();
	}
	
//	public static void insert()
//	{
//		int a[]= {10,20,30,40};
//        int pos = 2;
//        int v = 5;
//        System.out.println(Arrays.toString(a)); 
//        
//        for (int i = a.length - 1; i > pos; i--) 
//        {
//            a[i]=a[i-1];
//        }
//        a[pos] = v;
//        System.out.println( Arrays.toString(a));
//	}
	
}
