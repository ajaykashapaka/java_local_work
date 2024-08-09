
public class Dup_String 
{
	public static void main(String[] args) 
  	{       
      String str=("java is my favorate and java is platform independent ") ;  
      
      String[] st=str.split(" ");
           
      String revString="";
      for(String s:st)
      {
    	  String Revword="";
    	  
    	  for(int i=s.length()-1;i>=0;i--)
    	  {
    		  Revword+=s.charAt(i);
    	  }
    	  
    	revString+=Revword+" ";	  
      }
      
      System.out.println(revString);
      
      
      System.out.println("i am ajay"+50*30+'c'+0.0);
      
      char c;
      System.out.println();
	
 
	}
}
