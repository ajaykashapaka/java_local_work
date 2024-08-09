import java.util.*;
public class TreeS {

	public static void main(String[] args)
	{
		 
		TreeSet a=new TreeSet();
        
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(8);
		//a.add(2);
		System.out.println(a);	
		System.out.println(a.last());
		System.out.println(a.headSet(4));
		
		System.out.println(a.tailSet(4));
		System.out.println(a.subSet(2,8));
	}

}
