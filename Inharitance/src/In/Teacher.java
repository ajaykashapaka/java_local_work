package In;

public class Teacher
{
  String disgination;
  String collegename;
  Teacher ()
  {
	  disgination="teacher";
	  collegename="packet@prep";
  }
	public static void main(String[] args) 
	{
	 java j=new java();
	 System.out.print(j.disgination+"\n"+j.collegename+"\n:"+j.Subject+"\n "+j.empoyee+""+j.salary);

	}
}
class java extends Teacher   //child
{
	String Subject="java";
	String empoyee="krishna";
	int salary=70000;
}
