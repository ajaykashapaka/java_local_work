import java.util.Scanner;

public class fibobic 
{

	public static void main(String[] args) 
	{  
	 int f=0,s=1,t,i;
	 System.out.print(f+" "+s);
	 for(i=1;i<=10;i++)//1<=10;2
	 {
		 t=f+s;//0+1=1;1+1=2+1=3+2=5;8
		 System.out.print(" "+t);//1//2//3//5"
		 f=s;//1;1;2;3
		 s=t;//1;2;3;5
	 }
	 System.out.println(" ");
	}
}