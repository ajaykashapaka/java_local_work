
public class Mythread extends Thread
{
   /*public void run()
   {
	   System.out.println("IN CHILD");
   }*/
	public static void main(String[] args)
	{
		
     Mythread d=new Mythread();
     d.start();
    System.out.println("THREAD INFO"+d);
    
    System.out.println("THREAD NAME"+ d.getName());  // 0
    
    d.setName("AJAY");
    System.out.println("AFTER SET NAME"+d.getName()); //AJAY
    
    System.out.println("GET ID"+ d.getId());
    
    System.out.println("GET PRIORITY"+ d.getPriority()); // 5
    
    d.setPriority(2);
    
    System.out.println("after set priority"+ d.getPriority() );
    
	}

 


}
