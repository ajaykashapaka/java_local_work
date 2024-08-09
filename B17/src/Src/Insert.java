package Src;

public class Insert {

	public static void main(String[] args) 
	{
		int[] a=new int[] {10,20,30,40,50};
		int pos=3;
		int insert=60;int i; 
		
		
		for(i=a.length-1;i>3-1;i--)//4>2true//3>2true//2>2false
		{
			a[i]=a[i-1];//a[4]==a[4-1]=40//a[3]=a[3-1]==30;a[2]
			System.out.println(a[i]);
		}
		a[pos-1]=insert;
		 for(i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }

	}

}
