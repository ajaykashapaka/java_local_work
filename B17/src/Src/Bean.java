package Src;
public class Bean
{
	public static void main(String[] args)
	{
     Chaithu c=new Chaithu();
     c.setStudent(12,"ramu");
     System.out.println(c.getStudentname());
    System.out.println(c.getStudentroll()); 
	}
}
class Chaithu
{
	private int studentroll;
	private String studentname;
	public void setStudent(int studentroll,String studentname )
	{
		this.studentname=studentname;
		this.studentroll=studentroll;
	}
	public String getStudentname()
	{
		return studentname;
		
	}

	public int getStudentroll()
	{
		return studentroll;
		
	}
	
}
