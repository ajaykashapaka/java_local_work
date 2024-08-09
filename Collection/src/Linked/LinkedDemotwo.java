package Linked;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedDemotwo 
{
	public static void main(String[] args) 
	{
		LinkedList <Character> l=new LinkedList <Character>();
		l.add('A');
		l.add('J');
		l.add('A');
		l.add('Y');
		LinkedList <Character> l1=new LinkedList <Character>();
		l1.add('K');
		l1.add('U');
		l1.add('M');
		l1.add('A');
		l1.add('R');
		LinkedList <Character> new_l=new LinkedList <Character>();
		new_l.addAll(l);
		new_l.addAll(l1);
		System.out.println(new_l);  //[A, J, A, Y, K, U, M, A, R]
		
		// .Sort which is present in Collections
		Collections.sort(l);    //[A, A, J, Y]
		System.out.println(l);
		
		Collections.sort(l1);   //[A, K, M, R, U]
		System.out.println(l1);
		
		Collections.sort(new_l);//
		System.out.println(new_l);  //[A, A, A, J, K, M, R, U, Y]
		
		Collections.sort(new_l,Collections.reverseOrder());
		System.out.println(new_l);//[Y, U, R, M, K, J, A, A, A]
		
		l.addFirst('K');
		System.out.println(l);//[K, A, A, J, Y]
		
		l.addLast('Y');
		System.out.println(l);//[K, A, A, J, Y, Y]
		
		//revomelast &removefirst
		l.removeFirst();
		l.removeLast();
		System.out.println(l);//[A, A, J, Y]
		
	}

}
