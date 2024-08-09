import java.util.*;
import java.lang.*;
public class Demo_Game {

	public static void main(String[] args) throws ArithmeticException
	{
		Scanner sc=new Scanner(System.in);
		 
		// String input=("7.63 6.34 7.80 8.01 61.45 8.10 6.90 7.34 8.00 7.45 7.80 7.00 7.10 7.29 8.20 6.32 6.34 8.32 ");
		 String input =sc.next();
		 
		
		 String[] s=input.split(" ");
		  
		 
		 List l=new ArrayList();
		 
		 List L=new ArrayList();
		 
		// double b=Double.parseDouble(s[]);
		 for(int values=0;values<s.length;values++)
		 {
			  
			 l.add(s[values]);
		 }
		 
		// System.out.println(l.size());
		 
		 Collections.sort(l);
	 
		 for(int persons=1;persons<=6;persons++)  // pers1
		 {
			  double d=0;
			  
			  for(int rounds=persons;rounds<s.length;rounds=rounds+6)  //1<=18;
			  {
				  d=d+Double.parseDouble(s[persons-1]); //7.63+
				  
			  }
			 L.add(d);
		 } 
		 
		 
		 Comparable c=Collections.max(l); //8.32
		 
		 System.out.println(l);
		 
		 System.out.println(l.indexOf(c));
           double D;
           System.out.println((l.indexOf(c)%6+1)+"max"+c);
           System.out.println("player"+"Winner"+c);
        		   
	}

}
