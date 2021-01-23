import java.util.Scanner;
public class Prima 

{
 
    public static int bilprim(int number, int index)
	{
        if (index==1)
            return 1;
        else if (number % index == 0)
            return 1 + bilprim(number, --index);
        else
            return 0 + bilprim(number, --index);
    }
 
    public static boolean cekBilanganPrima(int prim)
	{
        if (prim>1)
            return (bilprim(prim, prim)==2);
        else
            return false;
    }
 
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
		System.out.print("Angka yang akan di cek : ");
		int prim=in.nextInt();
		
        if (cekBilanganPrima(prim))
            System.out.println(prim+ " adalah Bilangan Prima");
        else
            System.out.println(prim+ " Bukan Bilangan Prima");
    }
 
}