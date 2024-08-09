package ARRAYS;

public class InserINarray
{
	public static void main(String[] args) 
	{
		 int[] a=new int[] {10,20,30,40,50,60,70};
		 int i,insert=45;
		 int length=a[a.length+1];
		 for(i=0;i<length;i++)
		 { 
			 if(i==3)
			 {
				 a[i]=insert;
			 } 
		 }
		 System.out.println(a[i]);

	}

}
