import java.util.Scanner;
public class deret{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Deret Fibonacci : ");
		int n = in.nextInt();
		int fib[]=new int[100];
		
		int sum=0;
		int i;
		int jumlah=0;
		fib[0]=1;
		fib[1]=2;
		
		for(i=2; i<n; i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		for(i=0; i<n; i++){
			System.out.print(fib[i]+" ");
		}
		for(int num:fib)
		{
			sum= sum+num;
		}
			System.out.print("Jumlah= "+sum);
	}
}

