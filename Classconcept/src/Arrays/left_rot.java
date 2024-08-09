package Arrays;

public class left_rot 
{
	public static void main(String[] args)
	{
		 int[] ar=new int[] {10,20,30,40,50,60,70 };
		 int i,temp;
		 temp=ar[0];//10
		 System.out.println("before rot");
		 for(int X:ar) 
		 {
		  System.out.println(X);
		 }
		
		 for(i=0;i<ar.length-1;i++)//0<7-1;1<6;2<6;3<6;4<6;5<6;6<6
		 {
			 ar[i]=ar[i+1];//20//30;40;50;60;70
		 } 
		 ar[i]=temp;//ar[6]=10
		 System.out.println("after");
		 for(i=0;i<ar.length;i++)//
			 System.out.println(ar[i]);	 
	}
}
