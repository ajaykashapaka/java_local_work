package List;
 import java.util.*;
public class Aray
{
	public static void main(String[] args)
	{ 
		List <String>s=new ArrayList<>();
		
		s.add("ajay");
		s.add("ramu");	
		s.add("salman");
		s.add("ganesh");        
		
		s.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(s);
	}

}
