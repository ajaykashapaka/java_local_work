
public class Comp {

	public static void main(String[] args)
	{
	   
		 String str=new String("123,12");
		
    	 str.split(" ");
		  
		 int i=Integer.parseInt(str,str.charAt(1));
		 
		 System.out.println(i);
		   
		
	/*	String str= ("Programmer");     // Chocolate 
		
		 String F=str.substring(0,1);
		  System.out.println(F);
		  
		 String Remaing=str.substring(1,str.length());
	  System.out.println(Remaing);
	  
	  String ToUpper=F.toUpperCase();
	  
	  String  Final=ToUpper+Remaing;
	  System.out.println(Final);  */
	  
	 /* 
	  String  str=("Chocolate");  //C h o c o l a t e
	  
	  //System.out.print(str.substring(0,5));  //choco
	  
	  System.out.print(str.substring(0,4)); // choc
	  
	  System.out.print(str.substring(0,3)); // cho
	  System.out.print(str.substring(0,2)); // ch
	  
	  System.out.print(str.substring(0,1)); //c */
		
		/*
		String str=("java is platform independet language");  // Original String 
	    String word[]=str.split(" ");  // spliting the string that can be Stored in array
	     
	    String RevString="";
	    
	    for(String w:word) // words -- 5
	    {
	    	String RevWord="";  // this is for reverse the word
	    	for(int i=w.length()-1;i>=0;i--) //java 
	    	{
	    	   RevWord=RevWord+w.charAt(i);	 // charector by char it stored
	    	}
	    	
	    	RevString=RevString+RevWord+" ";  // word by word Strored 
	    }
	    System.out.println( RevString);  */
		
	/*	
		String str="wellcome to java";
		
		String[] st=str.split("\\s+");
		
		String revString="";
		
		for(String s:st)
		{
			StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			revString =revString+sb.toString()+" ";
		}
		System.out.println(revString);
		*/
		
		String s="Ajay";
		System.out.println(s.toString());
	}

}
