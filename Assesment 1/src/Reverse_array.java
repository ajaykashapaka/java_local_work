
public class Reverse_array 
{
	public static void main(String[] args) 
	 { 
		int[] a=new int[] {4,6,8,10,80,60,66,10};
		int j,i;
		for(i=0;i<a.length/2;i++)
		{
			for(j=i+1;j<a.length/2;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				
				}
			 
			}
			System.out.print(" "+a[i]);
		}
		for(i=a.length/2;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				
				}
			}
			System.out.print(" "+a[i]);
		}
		int rot=3;
		for(i=rot;i<a.length;i++)
		{
			System.out.println("\n");
			System.out.println(a[i]);
		}
		for(i=0;i<rot;i++)
		{
			System.out.println(a[i]);
		}
	}
}
