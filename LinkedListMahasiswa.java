import java.util.*;
import java.io.InputStream;
public class LinkedListMahasiswa{
	public static void main(String[]args){
	Scanner in = new Scanner (System.in);
	LinkedList list = new LinkedList ();
	System.out.println("======================================");
	System.out.print("Input data mahasiswa : ");
	int n = in.nextInt();
	for (int i=0; i<n; i++)
		{
			System.out.print("Mahasiswa ke-" +(i+1)+ " : ");
			String nama = in.next();
			list.addFirst(nama);
		}

	System.out.println("======================================");
	list.tampilkan();
	list.sort();
	System.out.println("\tSORTING");
	System.out.print("Data Nama Mahasiswa Setelah Diurutkan :");
	list.tampilkan();
	System.out.println("======================================");
	System.out.println("\tSEARCHING");
	System.out.print("Masukkan nama mahasiswa yang ingin dicari : ");
	String searching = in.next();
	list.search(searching);
	}
}