import java.util.Scanner;

public class Student_demo 
{
	int i,count=0,sum;
	public static void main(String[] args) 
	{
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER ANY VALUE");
	 int input=sc.nextInt();//
	 System.out.println(input);
	 Student_demo s=new Student_demo();
     int result= s.display(input);
     if(result==input)
    	 System.out.println("arm");
     else
    	 System.out.println("NOT A arm");
	}
	 
	public int display(int input) 
	{
		for(input=input;input<=input;input++)
		{
		int rem = 0;
		while(i!=0)
		{
			i=i/10;
			count=count+1;
		}
		while(i!=0)
		{
		 rem=i%10;
		 i=i/10;
		 sum=(int)(sum+Math.pow(rem,count));
		}
		}
		return sum;
	}

}
 	

