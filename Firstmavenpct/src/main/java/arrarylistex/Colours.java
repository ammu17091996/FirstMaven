package arrarylistex;

import java.util.ArrayList;
import java.util.Iterator;

public class Colours {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Blue");
		a.add("Green");
		a.add("Yellow");
		a.add("Orange"); 
		Iterator it=a.iterator();
		
		while(it.hasNext())	
		{
	System.out.println(it.next());
		}
	a.contains("Orange");
	{
		System.out.println("Element found");
	}
	}
}