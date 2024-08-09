package Arrays;

public class rotation {

	public static void main(String[] args)
	{ 
		int[] ar=new int[] {10,20,30,40,50,60,70};
		int temp,i;
		System.out.println("before rot");
	
	for(i=0;i<ar.length;i++)
	{
            System.out.print(ar[i]+" ");
	}
	temp=ar.length-1;
	for(i=ar.length-1;i>0;i--)
	{
		 ar[i]=ar[i-1];
	}
	ar[i]=ar[temp];
	System.out.println("after rot");
	for(int z:ar)
	{
		System.out.print(z+" ");
	}
	}
}
