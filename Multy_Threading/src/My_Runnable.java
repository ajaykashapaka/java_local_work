
public class My_Runnable extends Thread implements Runnable 
{
	public static void main(String[] args)
	{ 
     My_Runnable r=new My_Runnable();
    // Thread T=new Thread(r);
     r.start();
	}

	@Override
	public void run() 
	{
	 for(int i=0;i<5;i++)
	 {
		 System.out.println(i);
	 }	
	}
}
 
 
