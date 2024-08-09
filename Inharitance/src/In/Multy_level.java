package In;

public class Multy_level 
{
	public static void main(String[] args) 
	{
	 Multy_level ml=new Multy_level();
	}
}
class Employee
{
	String Employeename;
	char EmployeeIntioal;
    
}
class Trainer extends Employee
{
	int salary;
	
}
class Programmer extends Trainer
{
	int i;
}
class Developer extends Programmer
{
	
}
