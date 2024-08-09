
public class ArrayString {

	public static void main(String[] args)
	{
		 String str=new String("AJAY KUMAR");
		 str.split("");
		 
		 System.out.println(str.charAt(1));
		 //reverse the string Values
		 int i;
		 for(i=str.length()-1;i>=0;i--)
		 {
			 System.out.print(str.charAt(i));
		 }
		 // converting the String into Array
		  char[] s=str.toCharArray();
           for( i=0;i<s.length;i++)
           {
        	   System.out.print(s[i]);
           } 
	}

}
