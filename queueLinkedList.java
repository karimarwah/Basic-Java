import java.util.LinkedList;
public class queueLinkedList{
	public static void main(String[]args){

		LinkedList<String> sayur = new LinkedList<>();
		sayur.add("wortel");
		sayur.add("kol");
		sayur.add("Buncis");
		sayur.add("sawi");
		sayur.add("bayam");
		sayur.add("Kangkung");
		sayur.add("Lobak");		

		sayur.addFirst("Kembangkol");
		sayur.addLast("paprika");							
		sayur.set(2, "Kol");
		sayur.set(5, "bayam");									
		System.out.println("\nNama sayur \t\t: "+sayur);		
		System.out.println("Jumlah sayur \t\t: "+sayur.size());
		System.out.println("Ambil Awal\t\t: "+sayur.getFirst());
		System.out.println("Ambil Akhir\t\t: "+sayur.getLast());
		
		sayur.removeFirst();
		sayur.removeLast();
		
		System.out.println("\nNama sayur \t\t: "+sayur);
		System.out.println("Jumlah sayur \t\t: "+sayur.size());
		
		System.out.println("\nAmbil sayur ke-2\t: "+sayur.get(1));
		System.out.println("Ambil sayur ke-4\t: "+sayur.get(4));
		
		sayur.remove(1);
		sayur.remove(3);
		
		System.out.println("\nNama sayur \t\t: "+sayur);
		System.out.println("Jumlah sayur \t\t: "+sayur.size());
	}
}
