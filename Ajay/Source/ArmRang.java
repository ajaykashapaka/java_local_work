package Source;

public class ArmRang {

	public static void main(String[] args) 
	{
     int num ;
     int rem,arm=0; 
     int temp,count;
     for(num=1;num<=1000;num++)//23<=100t//153<0
     {
    	  temp=num;//temp=23//temp=153
    	  count=0;//0//0 
    	  arm=0;
    	  while(num!=0)//23>0//2>0//0>0f//153>0;15>0;1>0;0>0f
    	  {
    		  num=num/10;//23/10=2;2/10=0//15;1;0
    		  count++;//1//2//1;2;3
    	  }//0//num=0
    	  num=temp;//num=153
       while(num!=0)//23>0t//2>0t//153>0;15>0
        {
    	 rem=num%10;//3//2//3;5//1
    	 num=num/10;//2//0//15;1;0;1
    	 arm= (int) (arm+Math.pow(rem, count));//0+9+4=13//0+27;27+125=152//152+1=153
        }
     
     num=temp;//23
     
     if(num==arm)//23==13not
     {
    	 System.out.println( num);
     }
     
   
	}

	}
}
