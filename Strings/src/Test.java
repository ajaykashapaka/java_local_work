
public class Test 
{
	public static void main(String[] args) 
	{ 
       String st="aammerammu";
       
        int count=0;
        
        char[] c=st.toCharArray();
        System.out.println("Enter the values");
        
        for(int f=0;f<c.length;f++)  // 0>len
        {
        	count=0;
        	for(int s=0;s<c.length;s++)  // s=0 //
        	{
        		if(c[f]==c[s] && s!=f)  // a==a t ,0!=0f a==a 
        		{
        			count++;
        			
        			System.out.println("aa");
        		}	
        	}
        }        
	}
}
