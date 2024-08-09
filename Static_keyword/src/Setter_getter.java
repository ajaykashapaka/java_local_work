
public class Setter_getter
{
	public static void main(String[] args) 
	{ 
	   bean b=new bean ();
	   b.setroll(1);
	   b.setstudent("ajay");
	   b.getroll();
	   b.getname();
	   System.out.println(b.getroll()+" "+b.getname());
			   
	}
}
class bean 
{
	private int roll;
	private String name;
    public void setroll(int roll)
    {
    	this.roll=roll;
    }
    public void setstudent(String name)
    {
    	this.name=name;
    }
    public int getroll()
    {
    	return roll;
    }
    public String getname()
    {
    	return name;
    }
}
