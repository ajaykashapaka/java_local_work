package ARRAYS;
public class uniq_elements 
{
	public static void main(String[] args)
	{ 
		int[] a=new int[] {11,99,44,11,5,12,11,44};
		int i,j,temp=0;
	 
		for(i=0;i<a.length;i++)//0>8true
		{
		 for(j=0;j<a.length;j++)//0<8true//1<8//2<8//3<8
		  {   
			 temp=0;
			 if(i!=j)//0!=0flase;1!=0true//2!=0true//true
			 if(a[i]==a[j])//11==99flase;11=44flase;11==11
			 {
				temp++;//0+1=1
				break;
			 }
		  } 		 if(temp==0)
				System.out.println(a[i]);//99
		}
	}
}
