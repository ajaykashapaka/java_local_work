package PrirorityQ;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) 
	{
       PriorityQueue i=new PriorityQueue();
       
        i.add("A");
        i.add("B");
        i.add("a");
        
        
        System.out.println(i);
        
        System.out.println( i.element());
      
        System.out.println(i.peek());
        
        System.out.println(i.remove());
        System.out.println(i.poll());
        System.out.println(i);
       
	}

}
