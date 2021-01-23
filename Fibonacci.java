import java.util.Scanner;
public class Fibonacci {
    public static int fibbon(int x){
        if (x<=0 || x<=1){
            return x;
        }
        else{
            return fibbon(x-2)+fibbon(x-1);
        }
    }
    public static void main(String[]args)
	{
        Scanner in = new Scanner(System.in);
		System.out.print("Banyaknya deret : ");
		int n=in.nextInt();
		
        for (int i=0;i<n;i++){
            System.out.print(fibbon(i)+" ");
        }
    }
}