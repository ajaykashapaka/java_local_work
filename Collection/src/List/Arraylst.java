package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylst 
{
	public static void main(String[] args)
	{    
		 //Declare 
		
		 
		 ArrayList<Integer> a=new ArrayList<Integer>(); //By wrapper class
		
		 List l=new ArrayList(); // Upcasting 
		 
		 ArrayList al=new ArrayList ();// Both homo &hetero
		 //add the element to array
		 al.add(1);
		  al.add("BIKE");
		  al.add('B');
		  al.add(5000.00f);
		  
		  System.out.println(al);//[1, BIKE, B, 5000.0]
		 
		  // REMOVE ELEMENT -TWOWAYS 1)INDEX 2)OBJECT
		   // al.remove(1);// here index
		    al.remove("BIKE");// BIKE IS object 
		   System.out.println("Afer the revome:"+al); //Afer the revome:[1, B, 5000.0]
		  
		     // Insert element
		     al.add(1, "Bike");
		     System.out.println("after the insert:"+al);//after the insert:[1, Bike, B, 5000.0]
		    
		     //retrive the value contains() RETURN TRUE /FALSE
		     System.out.println(al.contains(3));//false
		     System.out.println(al.contains("Bike")); //true
		     
		     // elements in the array
		     System.out.println("Number of elements:"+al.size());//Number of elements:4
		     
		     //search the element
		     System.out.println(al.get(3)); //5000.0
		     
		     // reolace the element()
               al.set(1, "car");
               System.out.println("Afer the relacing:"+al);//Afer the relacing:[1, car, B, 5000.0]
               
             //isempty
               System.out.println(al.isEmpty());//false
              // clear()
               //al.clear();
               System.out.println(al);//[]
               System.out.println(al.isEmpty());//true 
		  // By using three ways
		  //for loop
               System.out.println("Useing For loop printing or read the data");
               for(int i=0;i<al.size();i++)
               {
            	   System.out.println(al.get(i)) ;
               }
		  //for each loop
               System.out.println("Useing for each loop");
               for(Object x: al)
               {
            	   System.out.println( x);
               } 
		  //iteretor
               System.out.println("Using iterator..");
                Iterator Ar=al.iterator();
                 while(Ar.hasNext())
                 {
                	System.out.println(Ar.next()); 
                 }
		  
		 System.out.println(al.getClass());
		 
		 
		 
	}
}
