
public class STC 
{
    int rollno;   // instance variables
    String  StudentName;
     static String collegename="Packet-prep";
     public static void change()
     {
    	 collegename="vagdevi";
     }
	public static void main(String[] args) 
	{
         STC c=new STC();
         c.rollno=1;
         c.StudentName="ajay";
         STC V=new STC();
         V.rollno=2;
         V.StudentName="Salman";
           change();
         System.out.println(c.rollno+" "+c.StudentName+" "+collegename);
         System.out.println(V.rollno+" "+V.StudentName+" "+collegename);
	}

}
