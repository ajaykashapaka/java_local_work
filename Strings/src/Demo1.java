
public class Demo1
{
	public static void main(String[] args) 
	{  
		char[] ch={'A','j','a','y'};// charecters
		  String str=new String(ch);  //storing in one unit
		  System.out.println(str);
		
		// concadination are two type 
	// one way is by useing + operator and anthor is concat()
	    String s=new String("Ajay"+"kumar");
	    String s1=new String ("ajay");
	    String s2=new String("kumar");
	   
	    // this is second way by using new keyword
	    System.out.println(s1.concat(s2));  //Ajaykumar   here momory will be wested
	    
	    
	    //by useing stringbuffer we can concat   // no memory will be wested
	     StringBuffer b=new StringBuffer("Ajay");  
	        b.append("kumar"); //  Ajaykumar
	        System.out.println(b);
	    
	    //touppercase()
	    System.out.println(s.toUpperCase()); //AJAYKUMAR
	    //tolowercase()
	    System.out.println(s.toLowerCase()); //ajaykumar
	    
	    
	     
	    //charAt()
	    System.out.println(s.charAt(2));  //it will gave Specific index  [A]
	    
	    // codePointAt()
	     System.out.println(s.codePointAt(2));   // 97
	     
	     //codePointBefore()
        System.out.println(s.codePointBefore(4));  //121	     
        
        //codePointCount
        System.out.println(s.codePointCount(3, 7));
          
        // compareto()
         System.out.println(s.compareTo(s1));
         
         //compareToIgnorecase()
         System.out.println(s.compareToIgnoreCase(s2));
          
         //cotains()
         System.out.println(s.contains("w")); // false gave boolean value
	}
}
