package Source;
class Intro 
{
  public static void main(String[] args) 
	{
	 house h1=new house();
     h1.housename="2BHK";
     h1.housewalls=4;
     h1.houseprice=100f;
     h1.block='A';
     house h2=new house();
     h2.block='b';
     
     house h3=new house();
	}
}
class house
{
	String housename;
	int housewalls;
	float houseprice;
	char block;	
}
