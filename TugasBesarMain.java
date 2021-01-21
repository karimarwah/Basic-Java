import java.util.*;

public class TugasBesarMain
{
	public static void main(String[] args)
	{
		
		HashTable htable = new HashTable();
		BFS bfs = new BFS();
		
		Scanner sc = new Scanner(System.in);
		int jalan;
		System.out.println("=================UJIAN AKHIR SEMESTER==============");
		System.out.println("");
		System.out.println("1. Hash Table");
		System.out.println("2. BFS ");
		System.out.println("");
		System.out.print("Pilih program yang akan dijalankan : ");
		jalan = sc.nextInt();
		
		if(jalan==1)
		{
			htable.outMethod();
		}
		else if(jalan==2)
		{
			bfs.outMethod();
		}
	}

}