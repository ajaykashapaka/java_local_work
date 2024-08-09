
public class  Student
{
	int rollNo;
	String Name;
	 
	    Student(   )  // Constructor
	    {
	     System.out.println(rollNo+"  " +Name);
	    }
     void m1()  // Method
	    {
	    	System.out.println(this.rollNo + " "+ this.Name);
	    }
	public static void main(String[] args) 
	{
		 Student j=new Student ();    
		 j.m1();  
	}  

}
