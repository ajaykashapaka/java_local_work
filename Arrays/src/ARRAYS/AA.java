package ARRAYS;
public class AA 
{
	public static void main(String[] args)
	{ 
		 String s=new String("ajayvvisvvavvprogrammer");
		  
		 String[]a =s.split("vv");
		 
		 for(int i=a.length-1;i>=0;i--)
		 {
			 System.out.print(a[i]);
		 }
		char[]  ch=s.toCharArray();  // 
		 
		 for(int i=ch.length-1;i>=ch.length-1;i--)
		 {
			 System.out.println(ch[i]);
		 }
		 for(int i=0;i<=ch.length-2;i++)
		 {
			 System.out.print(ch[i]);
		 }  
	}
}