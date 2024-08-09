
public class Student_ 
{
	String Studentname;
	int Studentroll;
	char section; 
	
     Student_(String Sn,int Sr)
	{
		Studentname=Sn;
		Studentroll=Sr;	
	}
     Student_(String Sn,int Sr,char c)
 	{
 		Studentname=Sn;
 		Studentroll=Sr;	
 		section=c;
 	}
	
	public static void main(String[] args)
	{ 
		Student_ s1=new Student_("ajay",12);
		Student_ s2=new Student_("raj",22,'A');
		
		/*s1.Studentname="Ajaykumar";
		s1.Studentroll=12;
		s1.section='A';
		
		
		s2.Studentname="Rajkumar";
		s2.Studentroll=12;
		s2.section='A';*/
		
		System.out.print(s1.Studentname+" "+s1.Studentroll+" "+s1.section+" ");
		System.out.print(s2.Studentname+" "+s2.Studentroll+" "+s2.section);
	}
}
