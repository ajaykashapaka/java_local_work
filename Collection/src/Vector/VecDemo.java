package Vector;

import java.util.Scanner;
import java.util.Vector;

public class VecDemo {

	public static void main(String[] args)
	{
		 Vector v=new Vector();
		 System.out.println(v.capacity());  //10
           
		  for(int i=1;i<=10;i++)
		  {
			  v.addElement(i);
			   
		  }
		   System.out.println("After inserting 10 Elemnets:"+v.capacity());  //10
		 
		   v.addElement("ramu");
		   System.out.println(v);
		   System.out.println("after adding one more element:"+v.capacity()); //20
		   
		   
		   
		     Vector v1=new Vector(10,3);
			 System.out.println(v.capacity());  //10
	           
			  for(int i=1;i<=10;i++)
			  {
				  v1.addElement(i);
				   
			  }
			 // System.out.println(v1.());
			   System.out.println("After inserting 10 Elemnets:"+v1.capacity());  //10
			 
			   v1.addElement("ramu");
			   System.out.println(v1);
			   System.out.println("after adding one more element:"+v1.capacity()); //13
	}

}
