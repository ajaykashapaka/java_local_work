import java.lang.*;
public class StringsTwo 
{
	public static void main(String[] args)
	{
	   String str=new String("ajaykumar");
	   char[] ch=str.toCharArray();
	   //System.out.println(ch);
	   int count=1;
	   for(char i=0;i<ch.length;i++)//A
	   {
		 
		   for(char j=i;j<ch.length;j++)
		   {
			   
			   if(ch[i]==ch[j]&&i!=j)
			   {
				  
				   System.out.print(ch[i]+"-->"+i);
				   
			   }
		   }
	   }
	   
	}
}
