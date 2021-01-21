import java.util.*;

public class HashTable
{
	public void outMethod()
	{
		Scanner sc = new Scanner(System.in);
		Enumeration names;
		String key,pilihan;
		
		//Creating Hashtable
		Hashtable<String,String> hashtable = new Hashtable<>();
		// Input data to Hashtable
		hashtable.put("Tipe data primitif","Tipe data yang hanya mampu menyimpan satu nilai tiap satu variabelnya dan defaultnya telah didefinisikan oleh java.");
		hashtable.put("Tipe data reference","Tipe data reference dalam java digunakan untuk merefrensikan sebuah object, class seperti String, Interface, dan Array. Tipe data reference mampu menampung lebih dari 1 data");
		hashtable.put("Byte","Tipe data berupa bilangan bulat berukuran 8 bit, dengan rentang -2^7 s.d 2^7-1");
		hashtable.put("Short","Tipe data berupa bilangan bulat berukuran 16 bit, dengan rentang -2^15 s.d 2^15-1");
		hashtable.put("Integer","Tipe data berupa bilangan bulat berukuran 32 bit, dengan rentang -2^31 s.d 2^31-1");
		hashtable.put("Long","Tipe data berupa bilangan bulat berukuran 64 bit, dengan rentang -2^63 s.d 2^63-1");
		hashtable.put("Boolean","Tipe data berupa nilai benar/salah berukuran 1 bit");
		hashtable.put("Float","Tipe data berupa bilangan riil berukuran 32 bit");
		hashtable.put("Double","Tipe data berupa bilangan riil berukuran 64 bit");
		hashtable.put("Char","Tipe data berupa karakter");
		hashtable.put("String","Tipe data reference yang dapat menyimpan banyak data berupa karakter");
		
		//Display available data on screen
		System.out.println("Istilah - istilah informatika\nData yang tersedia");
		Enumeration hashtableKeysEnum = hashtable.keys();
		
		while (hashtableKeysEnum.hasMoreElements())
		{
				System.out.println("- "+(String)hashtableKeysEnum.nextElement());
		}
		// User input keyword of which data is want to be displayed
		System.out.print("Input istilah yang ingin anda ketahui : ");
		pilihan = sc.nextLine();
		// makes first letter goes upper case, and the rest to lower case
		pilihan = pilihan.substring(0,1).toUpperCase() + pilihan.substring(1).toLowerCase();
		
		
		Enumeration searchkey = hashtable.keys();
		
		// Searching related keys
		while (searchkey.hasMoreElements())
		{
			key = (String)searchkey.nextElement();
				if(pilihan.equals(key))
					{
						System.out.println(hashtable.get(key));
					}
		}
		
		
		
	}
}