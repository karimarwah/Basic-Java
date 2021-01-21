import java.util.*;

public class hset
{
	public static void outMethod()
	{
		HashSet<String> hset = new HashSet<>();
		
		hset.add("Apple");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Duplicating elements
		hset.add("Apple");
		hset.add("Grapes");
		// null values
		hset.add(null);
		hset.add(null);
		// Displaying
		System.out.print(hset+"\n");
		for(String elements : hset)
			System.out.println(elements);
		
	}
}