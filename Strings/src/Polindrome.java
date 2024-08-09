
public class Polindrome {

	public static void main(String[] args) 
	{
      String str=new String("ANNA");
     StringBuffer s=new StringBuffer(str);
     StringBuffer s1=s.reverse();
     System.out.println(s);
     if(str.equals(s1))
     { 
    	 System.out.println("Polindrome");
     }
     else
     {
    	 System.out.println("not polindrome");
     }
	}

}
