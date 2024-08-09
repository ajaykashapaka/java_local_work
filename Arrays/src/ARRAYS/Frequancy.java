package ARRAYS;
public class Frequancy {
	public static void main(String[] args) 
	{
	 int[] a=new int [] {9,0,5,2,9,9,6,8,8,6};
	 int[] f=new int[a.length];
	 int i,j;
	 for(i=0;i<a.length;i++)
	 {
		 f[i]=-1;//-1 -1 -1 -1 0 0  -1 -1 -1 -1 
	 }
	 for(i=0;i<a.length;i++)//0<10//
	 {
		int count=1;//1
		 for(j=i+1;j<a.length;j++)//0+1<10//1<10//
		 {
			 if(a[i]==a[j])//9==9;4//9==9;5
			 {
				 f[j]=0;//
				count++; 
			 }
			if(f[i]!=0)
			{
				f[i]=count;
			}
		 }
	 }		
	 for(i=0;i<a.length;i++)//
	   {
		 if(f[i]!=0)//3!=0
		     System.out.println(a[i]+"----->"+f[i]);//9--3//
	    }
	}
}
