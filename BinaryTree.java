import java.util.*;
     public class BinaryTree
     {
         public static void main(String[] args)
        {            
            Scanner scan = new Scanner(System.in);
            
            BT bt = new BT(); 
            
            System.out.println("Urutan Mahasiswa");          
      
 	       char ch;        
          
                System.out.println("\nData Mahasiswa\n");
                
                    System.out.print("Jumlah Data:");
					int jml = scan.nextInt(); 
					
					for(int i=0;i<=jml;i++)
					{
					System.out.println("NIM	:");
                    bt.insert( scan.nextInt() );
					
					
					}                    
                                           

 		   
                System.out.print("\nYnag Dimasukan : ");
                bt.postorder();
                System.out.print("\nDiurutkan : ");
                bt.preorder();
                                   
		}        
        }
     
