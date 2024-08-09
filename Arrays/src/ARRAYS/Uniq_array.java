package ARRAYS;

public class Uniq_array
{
	public static void main(String[] args)
	{
		int[] a=new int[] {1,2,1,4,5,2};
		int[] f=new int[a.length];
		for(int x:f)
		{
			x=-1;
			System.out.println(x);
		}
		int i,j,temp,count=1;
		for(i=0;i<a.length;i++)//0<10;1<10//2
		{ 
			for(j=i+1;j<a.length;j++)//0+1<10---9<10;10<10flase
			{
			 count=1;//
				   if(a[i]==a[j])//1==23;1==1//23==flase//
				    {
				    	count++;//1+1+1=3//
				    	f[j]=0;//
				     }//-1 -1 0 -1 -1 -1 0 -1 -1 -1
			}
			if(f[i]!=0)//f[0]true
			{
				f[i]=count;//f[0]=3
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(f[i]!=0)
				System.out.println(a[i]+"--->"+f[i]);
		}

	}

}
