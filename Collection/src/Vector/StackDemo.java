package Vector;

import java.util.*;

public class StackDemo {

	public static void main(String[] args)
	{
		Stack s=new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		 s.push(40);
		 
		 for(int i=0;i<s.size();i++)
		 {
			 System.out.println(s.get(i));
		 }
				 
		  //s.pop();
		System.out.println(s.peek()); //40
		 System.out.println(s);
		 System.out.println(s.search("ramu"));//-1
		 System.out.println(s.search(40)); //1
	}

}
