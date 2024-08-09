package PrirorityQ;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Pri {

	public static void main(String[] args)
	{
		 PriorityQueue p=new PriorityQueue();
		 
		 // Adding element add() & offer()
		p.add("A");
		 p.add("B");
		 p.add("C");
		 p.offer("C"); 
		 
		 System.out.println(p);//[A, B, C, C]
		  
		 // remove or retrive element 
		 
		 //System.out.println(p.remove());//A IF empty it wil return java.util.NoSuchElementException
		 // System.out.println(p);// [B, C, C]
		 
		// System.out.println(p.poll()); //null
		 
		 System.out.println(p.size()); //3
		 
		 // the top element 
		 // System.out.println(p.element()); //A
		  
		 // System.out.println(p.peek()); //A
		 
		 System.out.println(p.iterator()); //java.util.PriorityQueue$Itr@4361bd48
		  Iterator i=p.iterator();
		  
	      while(i.hasNext())
	      {
	    	  System.out.println(i.next());
	      }

	}

}
