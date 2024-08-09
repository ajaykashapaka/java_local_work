package Linked;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkeddemo 
{
	public static void main(String[] args)
	{
		 // Declare the linked list
		
		// LinkedList l=new LinkedList(); // it will both home and hetero
        // LinkedList <Integer>l=new LinkedList <Integer>();  ==>wrapper class within gen
        // List l=new LinkedList();  ==>upcasting
		
		LinkedList l=new LinkedList();
		 l.add(1);
		 l.add(12.6f);
		 l.add(2022);
		 l.add("WELL-COME");
		 l.add('W');
		 l.add(2021);
		 System.out.println(l);//[1, 12.6, 2022, WELL-COME, W, 2021]
		 
		 // delete one element
		 l.remove(3);
		 System.out.println("After removing:"+l);//[1, 12.6, 2022, W, 2021]
		 
		 // if we want to element in particular index
		 l.add(3,"well-come");
		 System.out.println("After adding the element:"+l);//[1, 12.6, 2022, well-come, W, 2021]
		 
		 //if want spefic index value or element
		 l.get(3);
		 System.out.println( l.get(3));// W
		 
		 // getfirst & getlast
		 System.out.println(l.getFirst());// 1
		 System.out.println(l.getLast());//2021
		 
		 // Elements that are present int array list or length
		 System.out.println(l.size());//6
		 
		 /*Collections.sort(l);
		 for(Object i:l)
		 {
			 System.out.println(i);
		 }*/ //which is not possible y becase heteroginous elements are present
		 
		 // Change the value or replace the element
		 l.set(3, "wee are engineer");
		 System.out.println("After Replce element:"+l);//[1, 12.6, 2022, wee are engineer, W, 2021]
		 
		 // contains element present in the array or not
		 System.out.println(l.contains("well-come"));// flase
		 System.out.println(l.contains("wee are engineer"));// true
		 
		 // isEmpty which is used check the collection is empty or not
		 System.out.println(l.isEmpty());//flase
		 
		 //read or print elements
		 System.out.println("For useing forloop:");
		 for( int i=0;i<l.size();i++)
		 {
			 System.out.print(l.get(i)+" ");//1 12.6 2022 wee are engineer W 2021 
		 }
		 
		 System.out.println("Using for each :");
		 for(Object x:l)
		 {
			 System.out.print(x+" ");//12.6 2022 wee are engineer W 2021 
		 }
		
		 System.out.println("by using iterator:");
		  Iterator i=l.iterator();
		  while(i.hasNext())
		  {
			  System.out.print(i.next()+" ");//1 12.6 2022 wee are engineer W 2021
		  }
		   System.out.println(l.removeFirst());
		   System.out.println(l.removeLast());
		   System.out.println("AFTER removing first &last:"+l);//[12.6, 2022, wee are engineer, W]
		  
		  //remove all()
		  l.removeAll(l);
		  System.out.println(l);//[]
		  
		  // clear()
		  l.clear();
		  System.out.println("After clear:"+l);//[]	  
		  
		  l.add(null);
		  System.out.println(l);
		  
	}
}
