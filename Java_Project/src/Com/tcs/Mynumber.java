package Com.tcs;

public class Mynumber 
{
	public static void main(String[] args) 
	{
		 // fibonacci series
		int fst=0,scn=1,thrd;
		int fib;
		System.out.println(fst+" "+scn);
		for(int i=0;i<=10;i++)
		{
			
			thrd=fst+scn;
			System.out.println(thrd);
			fst=scn;
			scn=thrd;
		}
	}

}
