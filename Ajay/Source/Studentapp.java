package Source;                                                                                                          
public class Studentapp                                                                                     
{                                                                                                                                                                                                                    
	public static void main(String[] args)                                                                  
	{                                                                                                       
		String studentname="ajay";                                                                          
		char studentsection='A';                                                                            
		int  studentroll=32;                                                                                
		float studentmarks,m1=2f,m2=2f,m3=1f,m4=34f;                                                     
		double studentfee=30000;                                                                             
		double scholarship;  
		boolean sports,technical,culture;
		studentmarks=(float)(m1+m2+m3+m4);//22+27+16+34=99                                                  
		System.out.println(studentmarks);//99.0                                                             
		if ((studentmarks>=80 && studentmarks<=100))//true&&true                                              
		 scholarship=10000;                                                                                 
		else if ((studentmarks>=65 && studentmarks<=79))//f&&t                                                
			scholarship=5000;                                                                               
		else if((studentmarks>=55 && studentmarks<=64))//f&&f                                                 
			scholarship=1000; 
		
		else                                                                                                
			scholarship=0; 
		studentfee=studentfee- scholarship;
		System.out.println( "studentfee"+ scholarship);
		System.out.println(studentname+"name\n"+studentroll+"roll no===\n"+studentsection+"section==\n"+studentmarks+"marks\n"+scholarship+"schlor ship");    
		//ajay 32 A 99.0 10000                                                                              
	}                                                                                                                                                                                                                  
}                                                                                                           
                                                                                                            