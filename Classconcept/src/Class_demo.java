 public class Class_demo 
{
	public static void main(String[] args) 
	{  
		Student s1=new Student();
		s1.studentname="ajay";
		s1.studentnumber=34;
		s1.studentsection='A';
		s1.marks=67;
		s1.fee=2300;
		System.out.println("S1 STUDENT DETAILS:");
		s1.studentdetails();//method call
		Student s2=new Student();
		s2.studentname="Sunny";
		s2.studentnumber=23;
		s2.studentsection='B';
		s2.marks=64;
		s2.fee=3200;
		System.out.println("S2 STUDENT DETAILS:");
		s2.studentdetails();//method call
 	} 
}
class Student
  {
   String studentname;
   int studentnumber;
   char studentsection;
   float marks;
   double fee;
   public void studentdetails()//void it won't give any results
   {
	   System.out.println(studentname+"\t"+studentnumber+"\t"+studentsection+"\t"+marks+"\t"+fee);
   }
}
