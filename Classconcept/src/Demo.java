
public class Demo
{
	public static void main(String[] args) 
	{
		Student2 s1=new 	Student2();
		s1.studentname="ajay";
		s1.studentroll=34;
		s1.display(s1.studentname,s1.studentroll);
	}
}
class Student2
{
	String studentname;
	int studentroll;
	public void display(String studentname,int studentroll) 
	{
		System.out.println(studentname+" "+studentroll);
	}
	
}
