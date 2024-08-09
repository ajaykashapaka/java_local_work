
public class Demotwo extends Thread
{
    public void run()
    {
    	System.out.println(currentThread().getName());
    	setName("run");
    	System.out.println(currentThread().getName());
    	for(int i=0;i<=5;i++)
    	{
    		System.out.println("AAA1");
    	}
    }
	public static void main(String[] args) throws InterruptedException
	{
		Demotwo t=new Demotwo() ;
	//	t.sleep(2000);
		t.start();
		 for(int i=0;i<=5;i++)
		 {
			 System.out.println("ppp");	
		 } 
		 System.out.println(Thread.currentThread().getName());

	}

}
