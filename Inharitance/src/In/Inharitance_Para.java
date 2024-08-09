package In;

public class Inharitance_Para 
{
	public static void main(String[] args) 
	{ 
		Student1 S1=new Student1 ("Ajay",'A',12,88,"MI");
		System.out.println("student details ");
		System.out.print(S1.studentname+" "+S1.studentsection+"  "+S1.studentroll);
		System.out.print(" "+S1.Studentmarks+" "+S1.Studentphone);
	}
}
class Student  //Parent
{
	String studentname;//instance variables
	char studentsection;
	int studentroll;
	Student(String sn,char ss,int roll)   //parameterzid constuctor
	{
		
	}
}
class Student1 extends Student //child
{
	 float Studentmarks;
     String Studentphone;
	Student1(String sn, char ss, int roll,float sm,String sp) 
	{
	 super(sn,ss,roll);
	 studentname=sn;      //instance variables
	 studentsection=ss;
	 studentroll=roll;
	 Studentmarks=sm;
	 Studentphone=sp;
	}	
}
