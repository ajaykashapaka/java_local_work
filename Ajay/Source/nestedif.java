package Source;
public class nestedif //blood donation
{
	public static void main(String[] args)
	{
		 int age=23,weight=54;
		 if(age>=18)//true
		 {
			 if(weight>=50)//true
			 {
				 System.out.println("eligible to donate blood");
			 }
		 }
		 else {
			 System.out.println("not eligible");
		 }
	}
}
