import java.util.*;
public class Str 
{
	public static void main(String[] args)
	{
		/* String s="wellcome to my room";
		 
		 s.substring(1,3);
		 String[] s1=s.split(" ");  // 3 word
		 String str=""; // 
		 for(String n:s1)
		 {
			 StringBuffer s2= new StringBuffer(n);
			 s2.reverse();
			 st=st+s2.toString()+" ";
		 }
		 System.out.println(st);
		  
		  
		 
		 StringBuffer str1=new StringBuffer("ajay");
		 str1.reverse();
		 System.out.println(str1); */
		 
		/*
		String str="ajay";
		
		for(int a=str.length()-1;a>=0;a--)
		{
			System.out.print(str.charAt(a)+" ");
		}
             */
		
	/*	
		String s1="listen";
		String s2="silent";
		
		if(s1.length()==s2.length())
		{
			char [] s3=s1.toCharArray();
			char[]  s4=s1.toCharArray();
			
			Arrays.sort(s3);
			Arrays.sort(s4);
			
			if(Arrays.equals(s3,s4))
			{
				System.out.println("anagram");
			}
			else
				System.out.println("not anagram");
		}
		else
			System.out.println("not anagram"); */
		
		
	/*	String s1="AjayEkumarI";
		
		s1=s1.toLowerCase();
		char[] c=s1.toCharArray();
		
		
		for(char i=0;i<=c.length-1;i++ )
		{
			
			if(c[i]== 'a'||c[i]=='e'|| c[i]=='i'|| c[i]=='o'||c[i]=='u')
			{
				System.out.println(c[i]);
			}
		}  */

		/*
		String s=new String("ajay");
		
		s=null;
		
		System.out.println(s.length()); */
		
		/*String s="Ajay123";
		
		s=s.toLowerCase();
		
		char[] c=s.toCharArray();
		 
		int integer=0 ,sum=0;
		for(int i=0;i<c.length;i++)
		{
			
			if(Character.isDigit(c[i]))
			{
				//System.out.println(c[i]);
				integer=integer+Integer.parseInt(String.valueOf(c[i]));
				//sum=sum+integer;
			}
		}
		System.out.println(integer); */
		
		
    /*	String str="salman is bad boy vinuthon is good boy";
		
		 String [] st=str.split(" ");  
		
		List l=new ArrayList( );
		
		HashSet s=new HashSet();
		
		for(String w:st)
		{
			if(!l.add(w));  //
			s.add(w);  // salman is bad boy vinuthon good
			
		}
		System.out.println(s);
//		System.out.println(l);  */
		
		String str="Ajay kumar";
		
		for(int c=0;c<str.length();c++)
		{
			System.out.print(str.charAt(c)+"");
	      
		}
		 
				
	}

}
