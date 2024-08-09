import java.util.Scanner;

public class DemoHello {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter city name");
		 String city=sc.next();
		 if(city.equalsIgnoreCase("Hyderabad"))
		 {
			 System.out.println("Hello Hyderabad ");
		 }
		 else if(city.equals("Bangulore"))
		 {
			 System.out.println("well-come to bangulore");
		 }
		 else if(city.equals("Mumbai"))
		 {
			System.out.println("well-come to mumbai"); 
		 }
		 else if(city.equals("Delhi"))
		 {
			 System.out.println("well-come to delhi");
		 }
		 else 
		 {
			 System.out.println("you are out of my delivery");
		 }
	}

}
