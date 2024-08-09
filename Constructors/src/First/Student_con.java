package First;

public class Student_con {

	public static void main(String args[])
	{
		Student S1=new Student("ajay",'a',12);
		S1.display();
		Student S2=new Student("ajju",'a',13);
		S2.display();

	}
}
class Student
{
	String Studentname;
	char Studentsection;
	int Studentno;
	Student(String name,char code,int roll)
	{
		Studentname=name;
		Studentsection=code;
		Studentno=roll;
	}
	public void display()
	{
		System.out.println(Studentname+" "+Studentsection+" "+Studentno);
	}
}