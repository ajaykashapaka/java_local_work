import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
      String str=new String("silent");
      String str1=new String("listen");
      char[] array1=str.toCharArray();
      char[]  array2=str1.toCharArray();
    
      // sorting the array values 
      Arrays.sort(array1);  //eilnst
      Arrays.sort(array2);  //eilnst
      
      if(String.valueOf(array1).equals(String.valueOf(array2)))
      {
    	  System.out.println("\n"+"Anagram");
      }
      else
      {
    	  System.out.println("not anagram");
      }
	} 

}
