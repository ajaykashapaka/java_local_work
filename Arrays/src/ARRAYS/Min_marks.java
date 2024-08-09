package ARRAYS;
import java.util.Scanner;
public class Min_marks
{
	public static void main(String[] args) 
	{
		 int[] Marks=new int[5];
		 int i,Min_marks;
		 System.out.println("Enter Marks");
		 Scanner sc=new Scanner(System.in);
		 for(i=0;i<Marks.length;i++) 
		 {
			 Marks[i]=sc.nextInt();
		 }
		 Min_marks=Marks[0];//10
		 for(i=0;i<Marks.length;i++)//0<6;1<6
		 {
			 if(Min_marks>=Marks[i])//10>10;10<20;10<30;10<40;10<50
			 {
				 Min_marks=Marks[i];//
			 }
		 }
		 System.out.println("Min marks="+Min_marks);
	}
}
