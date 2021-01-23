import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class UAS2{
	static Scanner in = new Scanner (System.in);
	public static int down = 0;
	public static int top = -1;
	public static String ar[] = new String[20];
	public static int arr[] = new int [10];
	
	public static void main(String[]args){
		System.out.println("=============UJIAN AKHIR SEMESTER=============");
		System.out.println("--------------[karima1177050057]--------------");
		System.out.println("    =============MIMASHOP.ID=============");
		System.out.println("");
		System.out.println("Roti Tawar : 001");
		System.out.println("Roti Tawar Kupas : 002");
		System.out.println("Roti Pandan : 003");
		System.out.println("Roti Pandan Kupas : 004");
		System.out.println("Roti Gandum : 005");
		System.out.println("Roti Gandum Kupas : 006");
		System.out.println("");
		String antrian;
		int menu=0,keluar=0;
		String nama;
		do{
			System.out.println("");
			System.out.println("Menu Program");
			System.out.println("1. Input Tanggal Kadaluarsa Barang");
			System.out.println("2. Mencari Barang yang sudah Kadaluarsa");
			System.out.println("3. Ganti Tanggal Kadaluarsa ");
			System.out.println("4. Urutkan barang dari tanggal kadaluarsa cepat");
			System.out.println("5. Hapus Barang yang sudah kadaluarsa");
			System.out.println("6. Keluar");
			System.out.println("Pilih menu :");
			menu=in.nextInt();
			
			
			if(menu == 1)
			{
				//Scanner in = new Scanner(System.in);
			LinkList list=new LinkList();
			System.out.println("Masukan Tanggal Kadaluarsa Barang");
			
			for (int x=1;x<=6;x++){
				System.out.print("Barang ke "+x+" : ");
				int a = in.nextInt();
				list.tambahBelakang(a);
				}
			list.displayList();
			System.out.println("Ada Barang Baru masuk!!");
			System.out.println(" ");
			System.out.println("Roti Sobek : 001");
			System.out.println("Roti Tawar : 002");
			System.out.println("Roti Tawar Kupas : 003");
			System.out.println("Roti Pandan : 004");
			System.out.println("Roti Pandan Kupas : 005");
			System.out.println("Roti Gandum : 006");
			System.out.println("Roti Gandum Kupas : 007");
			
			System.out.print("\nTanggal Kadaluarsa : ");
			int b = in.nextInt();
			list.tambahDepan(b);
			list.displayList();
			}
			else if(menu==2)
			{
				//Scanner in = new Scanner(System.in);
			LinkList list=new LinkList();
			System.out.println("");
			list.search(211203);
			System.out.println();
			System.out.println("Roti yang sudah kadaluarsa : Roti Pandan");
			list.displayList();
				
			}
			else if(menu==3)
			{
				//Scanner in = new Scanner(System.in);
			LinkList list=new LinkList();
			System.out.println("Kesalahan Input Tanggal kadaluarsa !!!");
			list.edit(201207,221207);
			list.displayList();
			}
			else if(menu==4)
			{
				//Scanner in = new Scanner(System.in);
			LinkList list=new LinkList();
				list.sort();
			
			list.displayList();
			}
			else if (menu==5)
			{
				//Scanner in = new Scanner(System.in);
			LinkList list=new LinkList();
			System.out.println();
			System.out.println("");
			Node hapus;
			hapus=list.hapusTengah(3);
			if(hapus!=null)
			{
				System.out.println(hapus.data+"Barang yang sudah Kadaluarsa sudah dihapus.");
			}
			list.displayList();
			}
		}while (menu != 6);
	}
			    
 }
 
 class Node{
	public int data;
	public Node next;
	
	public Node(int d){
		data=d;
		next=null;
		}
}

// class LinkList
	class LinkList
	{
		private Node head, tail;
		private int wadah=0;
		public LinkList(){
			head=null;
	}
		public void tambahDepan(int d){
			Node baru=new Node(d);
			if(head==null){
				head=baru;
				tail=baru;
			}else{
				baru.next=head;
				head=baru;
			}
			wadah++;
		}
		
		public void tambahBelakang(int d){
			Node baru=new Node(d);
			if(head==null){
				head=baru;
				tail=baru;
			}else{
				tail.next=baru;
				tail=baru;
			}
			wadah++;
		}
		
		public void tambahTengah(int x, int d){
			Node baru=new Node(d);
			Node point;
			if(head==null){
				head=baru;
				tail=baru;
			}else{
				point=head;
				for(int i=0;i<x-1;i++){
				point=point.next;
				}
			baru.next=point.next;
			point.next=baru;
			}
			wadah++;
		}
		public Node hapusDepan(){
			if(head!=null){
			Node temp=head;
			head=head.next;
			temp.next=null;
			wadah--;
			return temp;
			}else{
			System.out.println("List Kosong!");
			return null;
			}
		}
		
		public Node hapusBelakang(){
			if(head!=null){
				Node temp,bantu;
				if(head.next==null){
					temp=head;
					head=tail=null;
				}else{
					bantu=head;
					while(bantu.next!=tail){
						bantu=bantu.next;
					}
					temp=tail;
					tail=bantu;
					tail.next=null;
				}
				wadah--;
				return temp;
			}else{
				System.out.println("List Kosong!");
				return null;
			}
		}
		public Node hapusTengah(int x){
			if(head!=null){
				Node temp, bantu;
				if(head.next==null){
					temp=head;
					head=tail=null;
				}else{
					bantu=head;
					for(int i=1;i<x-1;i++){
						bantu=bantu.next;
					}
					temp=bantu.next;
					bantu.next=temp.next;
					temp.next=null;
				}
				wadah--;
				return temp;
			}else{	
				System.out.println("List Kosong!");
				return null;
			}
		}
		private void swap(Node bantu1, Node bantu2){
			int d=0;
			Node temp=new Node(d);
			temp.data=bantu1.data;
			bantu1.data=bantu2.data;
			bantu2.data=temp.data;
		}
		public void search(int key){
			if(head != null){
				Node temp, bantu;
				boolean ketemu=false;
				int no=1;
				if(head.next==null){
					temp=head;
					if(temp.data==key){
						System.out.print(no+". \t");
						no++;
						System.out.println(temp.data);
						ketemu=true;
					}
				}else{
					bantu=head;
					while(bantu!=null){
						if(bantu.data==key){
							System.out.print(no+". \t");
							no++;
							System.out.println(bantu.data);
							ketemu=true;
							}
							bantu=bantu.next;
							}
							if(ketemu==false)
								System.out.println("Data tidak ditemukan");
								else
								System.out.println("pencarian selesai");
							}
						}else{
							System.out.println("List Kosong");
						}
				}
		private void display(Node temp){
			System.out.println(temp.data);
		}
		public void displayList(){
			if(head!=null){
				Node bantu=head;
				System.out.println("Tanggal Kadaluarsa :");
				while(bantu!=null){
					System.out.println(bantu.data+" ");
					bantu=bantu.next;
				}
				System.out.println("");
			}else{
			System.out.println("List Kosong");
			}
		}
		public void sort(){
			if(head!=null){
				Node bantu1, bantu2;
				for(int i=0;i<13;i++){
					bantu1=head;
					bantu2=head.next;
					for(int j=0;j<13;j++){
						if(bantu1.data>bantu2.data){
							swap(bantu1,bantu2);
						}
						bantu1=bantu1.next;
						bantu2=bantu2.next;
						}
				}
			}else{
				System.out.println("List Kosong");
			}
		}
		public void edit(int key, int editd){
			Node bantu;
			if(head!=null){
				bantu=head;
				while(bantu!=null){
					if(bantu.data==key){
						bantu.data=editd;
					}
					bantu=bantu.next;
					}
					}else{
						System.out.println("List Kosong");
					}
		}
}