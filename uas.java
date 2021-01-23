import java.util.*;

class Node{
	String data;
	Node next;
}

class LinkedList{
	Node head;
	int mk = 0;
	boolean kosong(){
		return head == null;
	}
	
	void insert(String data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null){
			head = node;
		}
		else{
			Node n = head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}
	}
	
	
	void show(){
		Node n = head;
		while(n.next!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print(n.data+" ");
	}
	
	

	void removeAtStart(){
		head = head.next;
	}
	
	void insertAt(int indeks,String data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		for(int i = 0;i<indeks-1;i++){
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
	
	void removeAt(int indeks){
		Node n = head;
		Node n1 = null;
		for(int i = 0;i<indeks-1;i++){
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;
	}
	
	void removeAtEnd(){
		Node n = head;
		Node n1 = null;
		System.out.print(head.data);
		while(n.next!=null){
			n1 = n;
			n = n.next;
		}
		n1.next = null;
	}
	
	void insertAtStart(String data){
		if(kosong()){
			insert(data);
		}
		else{
			Node node = new Node();
			node.data = data;
			node.next = head;
			head = node;
		}
	}
	
	void sort(){
		Node bantu = head;
		for(int i = 0;i<mk;i++){
			bantu = head;
			for(int j = 0;j<mk-1;j++){
				//System.out.println(bantu.data);
				if(bantu.data.compareTo(bantu.next.data)>0){
					String temp = bantu.data;
					bantu.data = bantu.next.data;
					bantu.next.data = temp;
				}
				bantu = bantu.next;
			}
		}
	}
	
	String cari(String data){
		Node bantu = head;
		while(bantu!=null){
			if(bantu.data.equalsIgnoreCase(data)){
				return "Data ditemukan";
			}
			bantu = bantu.next;
		}
		return "Data tidak ditemukan";
	}
}


public class uas
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		LinkedList edo = new LinkedList();			
		System.out.println("\n .: UAS PRAK.STRUKTUR DATA :.");
		System.out.println(" .: Revaldo Pratama Putra :. \n");
		
		int revaldo = 0;
		do
		{
			System.out.println("1. Tambah data barang");
			System.out.println("2. Hapus data barang");
			System.out.println("3. Pencarian data barang");
			System.out.println("4. Pengurutan data barang");
			System.out.println("5. Tampilkan data barang");
			System.out.println("6. Keluar");
			System.out.print("Pilih Menu : ");
			revaldo = input.nextInt();
			System.out.println();
			if (revaldo == 1)
			{
				System.out.println("TAMBAH DATA BARANG");
				System.out.print("Nama barang	: ");
				String barang = input.next();
				edo.insert(barang);
				sort(barang, 0);
				System.out.println("Input data [" + barang + "] berhasil\n");
				System.out.println();
			}
			else if(revaldo == 2)
			{
				System.out.println("HAPUS DATA BARANG");
				System.out.print("Hapus data di indeks : ");
				int hapus = input.nextInt();
				edo.removeAt(hapus);
				System.out.print("Hapus data berhasil");
				System.out.println();
			}
			else if (revaldo == 3)
			{
				System.out.println("CARI DATA BARANG");
				System.out.print("Cari nama barang :");
				System.out.println(edo.cari(input.nextLine()));
				System.out.println();
			}
			else if (revaldo == 4)
			{
				System.out.println("PENGURUTAN DATA BARANG");
				System.out.println("Data sebelum diurutkan :");
				edo.show();
				System.out.println();
				System.out.println("Data sesudah diurutkan :");
				edo.sort();
				System.out.println();
			}
			else if (revaldo == 5)
			{
				System.out.println("MENAMPILKAN DATA BARANG");
				edo.show();
				System.out.println("\n");
			}
			else if (revaldo == 6)
				System.out.println("[KELUAR PROGRAM LINKED LIST]\n~by Revaldo Pratama");
			else
				System.out.println("INPUT SALAH!\n");
			
				
				
		}
		while(revaldo != 6);
			

	}
	
	public static void sort(String data, int tampil){
		ArrayList<String> alist = new ArrayList<String>();
		alist.add(data);
		Collections.sort(alist);
		if (tampil==0)
			System.out.println();
		else
			System.out.println(alist);
	}
}