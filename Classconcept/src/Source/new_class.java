package Source;
public class new_class
{
	public static void main(String[] args) 
	{ 
		 int i=87,sum=0,count=0,temp=0,rem;
			while(i!=0)//87!=0
			{
			temp=i;
			 rem=i%10;//7//8
			 i=i/10;//8//0
			 sum=sum+rem*rem;//
			}
			//i=87
			if(temp==sum)//34==97
			{
		     System.out.println(sum);
			}
			else
				System.out.println("not a arm"+sum);
			
		
	}

}
