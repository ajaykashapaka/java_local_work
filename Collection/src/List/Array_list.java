package List;

import java.util.ArrayList;
import java.util.Collections;
 

public class Array_list 
{
	public static void main(String[] args)
	{
		ArrayList Al=new ArrayList();
		Al.add("J");
		Al.add("Y");
		Al.add("O");
		Al.add("T");
		Al.add("H");
		Al.add("I");
		Al.add(2);
		Al.add(3);
		
	 
		System.out.println(Al);//[J, y, O, T, H, I]
		ArrayList aj=new ArrayList();
		 aj.add("A");
		 aj.add("j");
		 aj.add("A");
		 aj.add("Y");
		 aj.addAll(Al);
		System.out.println( aj );//[J, Y, O, T, H, I]
		System.out.println(aj.size());
		
		/*for(Object x:aj)
		{
			System.out.println(x);
		} */
		
		for(int i=0;i<aj.size();i++)
		{
			System.out.print(aj.get(i)+" ");
		}
		  
		// Remove elements in array removeAll()
		 aj.removeAll(aj);
		 System.out.println("after remove:"+aj);//[]
		 
		 // Sort Collections.sort()
        Collections.sort(Al);
        System.out.println(Al);//[H, I, J, O, T, Y]
        Collections.sort(Al,Collections.reverseOrder());
        System.out.println(Al);//[Y, T, O, J, I, H]
        Collections.shuffle(Al);
        System.out.println(Al);//[Y, I, O, H, T, J]
        
        aj.add(null);
        System.out.println();
	}

}
