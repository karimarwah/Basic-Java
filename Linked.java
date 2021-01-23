import java.util.Scanner;
class X{
    int data;
    X next;
    
    X(int input){
        this(input, null);
    }
    
    X(int input, X node){
        data = input;
        next = node;
    }
}

class list1{
    private X awal;
    private X akhir;
    private int bil;
    
    public list1(){
        this (0);
    }
    
    public list1(int datalist){
        bil = datalist;
        awal = akhir = null;
    }
    
    public boolean kosong(){
        return awal == null;
    }
    
    public void tambahdata(int input){
        if (kosong()){
            awal = akhir = new X(input);
        }
        
        else{
            akhir = akhir.next = new X(input);
        }
    }
    
    public void cetakLinked()
	{
        System.out.println ("Nama Mahasiswa :");
        X cetak = awal;
        while (cetak!=null){
            System.out.print (cetak.data+" ");
            cetak = cetak.next;
        }
    }
}

public class Linked{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
            list1 xx = new list1();
            int data;
            System.out.print ("Masukan Nama Mhasiswa :");
            String jml = input.nextInt();
            
            for (int i=0;i<=data;i++)
                System.out.print ("Masukkan Data ke-"+(i+1)+" :");
                data = input.nextInt();
                xx.tambahdata(data);
            }
     
            
            
            boolean terus = false;
			{
            while(false)
			{
                System.out.print ("Ingin Tambah Data(Y/T) :");
                String jawab = input.next();
                char A = jawab.charAt(0);
                if ((A == 'T')||(A == 't')){
                    terus = true;
                }
                else{
                    System.out.print ("Tambah Berapa Data :");
                    int jml2 = input.nextInt();
                    System.out.println ("");
                    for (int i=0; i< jml2; i++){
                    System.out.print ("masukan data ke-"+(i+1+jml)+" :");
                    data = input.nextInt();
                    xx.tambahdata(data);
                    }
                    jml=jml+jml2;
                    System.out.println ("");
                    xx.cetakLinked();
                    System.out.println ("");
					xx.cetakLinked();
                }
				
 
            
            
			}
}
}