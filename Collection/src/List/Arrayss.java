package List;
 
import java.util.*;
public class Arrayss{

	public static void main(String[] args) 
	{
	 String a[]= {"Ajay","Kumar","Divya","Jyothi"};
	 
	 for(String i:a)
	 {
		 System.out.print(i+" ");
	 }
	 System.out.println(" ");
	 // convert the array int array list
	 ArrayList al=new ArrayList(Arrays.asList(a));
	 for(Object x:al)
	   {
		 System.out.print(x+" ");
	   }
	System.out.println(" ");
	 System.out.println(""+al);//[Ajay, Kumar, Divya, Jyothi]
	
	 int [] ab=new int[] {1,23,44,55};
	 for(int y:ab)
	 {
		 System.out.print(y+" ");
	 }
	 ArrayList all=new ArrayList(Arrays.asList(ab));
	 for(Object z:all)
	 {
		System.out.println(z); 
	 }
	 System.out.println(all);
	}

 

	 

}
