import java.util.*;

public class BinarySearch
{
	public void outMethod()
	{
	int first, last, middle, n ,search,array [];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of elements :");
	n = sc.nextInt();
	array = new int[n];
	System.out.println("Enter "+n +" Integers");
	for(int i=0;i<array.length;i++)
	{
		System.out.print("input integer :");
		array[i]= sc.nextInt();
	}
	
	System.out.print("\nInteger you'd like to search : ");
	search = sc.nextInt();
	
	first = 0;
	last=n-1;
	middle =(first + last)/2;
	for(int i =middle+1;i<=last;i++)
	{
		if(search==array[i])
		{
			System.out.println("Data ditemukan");
			return;
		}
	
	}
	
	for(int i=first;i<=middle;i++)
	{
		if(search==array[i])
		{
			System.out.println("Data ditemukan");
			return;
		}
	}
	System.out.println("Data tidak ditemukan");
}

}