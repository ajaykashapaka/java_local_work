package ARRAYS;
public class revertwo 
{
	public static void main(String[] args) 
	{
		String s=new String("program");
		char x[]=s.toCharArray();   // int a[]=new int []{1,2,3,4,5,6,7};
		int rot=3;
		int i;
		for(i=rot;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		for(i=0;i<rot;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
}
