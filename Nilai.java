import java.util.Scanner;
public class Nilai
{
	public static void main(String [] args)
	{
		Scanner in= new Scanner(System.in);
		
		byte n;
		char nm;
		
		System.out.print("Masukan nilai anda: ");
		n=in.nextByte();
		if(n>=85)
		{
			System.out.println("Nilai anda adalah A");
		}
		else if(n<=84&&n>=75)
		{
			System.out.println("Nilai anda adalah AB");
		}
		else if(n<=74&&n>=65)
		{
			System.out.println("Nilai anda adalah B");
		}
		else if(n<=64&&n>=50)
		{
			System.out.println("Nilai anda adalah BC");
		}
		else if(n<=49&&n>=35)
		{
			System.out.println("Nilai anda adalah C");
		}
		else if(n<=34&&n>=20)
		{
			System.out.println("Nilai anda adalah D");
		}
		else if(n<=19&&n>=0)
		{
			System.out.println("Nilai anda adalah E");
		}
	}
}