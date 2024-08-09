package List;
import java.util.*;
public class DemoOn {

	public static void main(String[] args)
	{ 
       String  [] a=new String[] {"ajay","kumar"};
       
        ArrayList l=new ArrayList(Arrays.asList(a));
        
        for(int i=0;i<l.size();i++)
        {
        	System.out.println(l.get(i));
        }
        System.out.println(l);
        
        
        int[] b=new int[] {1,2,3,4,5,6};
        
        List l1=new ArrayList(Arrays.asList(b));
        
        System.out.println(l1);
	}

}


