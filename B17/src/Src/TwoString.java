package Src;

public class TwoString 
{
     int studentroll;
     String studentname;
     TwoString (int studentroll, String studentname)
     {
    	  this.studentname=studentname;
    	  this.studentroll=studentroll;	  
     }
     public String toString()
     {
    	 return studentroll+" "+studentname;
    	 
     }
     
	public static void main(String[] args) 
	{ 
		
       TwoString S=new TwoString(23,"Ajay");
       System.out.println(S);
       
	}

}
