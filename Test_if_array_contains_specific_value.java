package arrayProg;

public class Test_if_array_contains_specific_value {
	public static void main(String[] args) {
		int a[]= {2,6,1,9,3};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		System.out.println();
		int b=9;
		int count=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==9)
			{
				count++;
//				System.out.println(i); //position
			}
		}
	
		if(count!=0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("not");
		}
		
	}
}
