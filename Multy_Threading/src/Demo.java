
public class Demo  extends Thread
  {
     public void start()
     {
    	 super.start(); 
    	 for(int i=0;i<4;i++)
    	 System.out.println("www");	 
     }
     public void run()
     {
    	 for(int i=0;i<4;i++)
    	 System.out.println("run method");
     }
	public static void main(String[] args)
	{ 
       Demo d=new Demo();
       d.start(); 
       
	}
}
