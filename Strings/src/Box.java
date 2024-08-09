import java.util.*;

public class Box {

	public static void main(String[] args)
	{ 
		int [] input=new int[] {50,-50,-20,10,20};
		
		String s=new String(" 50 -50 -20 10 20");
	
		String st[]=s.split(" ");
		
		int a=Integer.parseInt(s);
		
		List l=new ArrayList();
		//System.out.println(input.length);
		
		int count=0;
		
		for(int i=0;i<st.length;i++)
		{
			//if()
			{
				//System.out.println(input[i]);
				 count++;
				 
				 l.add(input[i]);
			}
		}
		System.out.println(s);
		System.out.println(count);
	}
}
