package Source;
public class innerandouterloop 
{
	public static void main(String[] args)
	{ 
		 int i,j;
		 for(i=1;i<=7;i++)
		 {
			 for(j=1;j<=i;j++)
			 {
				 if((j==1)||(i==7)||i==j)
					 System.out.println(j+"j");
				 else
					 System.out.println("space inner");
			 }
			 System.out.println("space outer");
		 }
	}
}
