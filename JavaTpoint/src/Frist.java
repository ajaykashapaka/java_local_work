
public class Frist 
{
	public static void main(String[] args) 
	{
		String s=new String ("nitin");
		
		String rev;
		int i;
		String temp="";
		
		for(i=s.length()-1;i>=0;i--)
			temp=temp+s.charAt(i);
		 	
		if(s.equals(temp))
			System.out.println("Yes polindrome");
		
		else
			System.out.println("Not A polindrome"); 
	}
 
}
