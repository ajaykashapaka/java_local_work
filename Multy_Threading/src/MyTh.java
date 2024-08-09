
public class MyTh  extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(3000);
				
			}
			catch(Exception e)
			{
				
			}
			System.out.println("child "+i);
		}
		
	}
	public static void main(String[] args)
	{
		MyTh m=new MyTh();
		m.start();
		
		//MyTh m1=new MyTh();
		//m1.start();
	
		for(int i=0;i<=5;i++)
		{
			try
			{
				//Thread.sleep(1000);
				
			}
			catch(Exception e)
			{
				
			}
			System.out.println("main"+i);
		}
		for(int j=1;j<=5;j++)
		{
			System.out.println("mm");
			try
			{
				Thread.sleep(1000);
				m.join();
			}
			catch(Exception e)
			{
				
			}	
		}
	}
}
