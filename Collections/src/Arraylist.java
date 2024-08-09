import java.util.*;

public class Arraylist
{
	public static void main(String[] args) 
	{
      List a=new ArrayList(); //{1,4,6,3,7,2,8};
      
      Collections.sort(a ,Collections.reverseOrder());
        Collections.sort(a);
       for(Object X:a)
    	   System.out.println(X);
	}

}
