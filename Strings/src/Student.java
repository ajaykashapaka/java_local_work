
public class Student
{
    int a;
    String name;
	public static void main(String[] args)
	{
		 Student s1=new Student();
		 s1.name="ajay";
		 s1.a=10;
		 System.out.println(s1.name+" "+s1.a);  // ajay 10
		 
		 s1=null;
		 System.out.println(s1.name+" "+s1.a);   // null pointer exception
		 
		 Student s=new Student();  //
		 
		 s1=s;
		 System.out.println(s1.name+" "+s1.a);  // null value	 
	}

}
