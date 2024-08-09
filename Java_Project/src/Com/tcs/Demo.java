package Com.tcs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Demo
{
	public static void main(String[] args)
	{
		List l=new ArrayList();
		ArrayList al=new ArrayList();
		List <Integer> in=new ArrayList<Integer>();
		ArrayList <String>  al2=new ArrayList<String> ();
		
		al.add(2);
		al.add("Ajay");
		al.add('K');			
		al.add(2,"kumar");
		
		al.set(0,1);
		//al.remove(3);
		al.set(3,"kashapaka");
		System.out.println(al.get(3));
		//al.removeAll(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Raju"));
		System.out.println("ArrayList:"+al+ "\n" +"number of elements:"+al.size());
		 
		
		/*System.out.println("Reading the elements by useing the forloop:");
		
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		  
		System.out.println("\n"+"Reading the elements by useing the foreach loop:");
		for(Object e:al)
		{
			System.out.print(e+"");
		}
		*/
		System.out.println("\n"+"Reading the elements by useing the iterator:");
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
