// Fibonacci series i.e 0 1 1 2 3 5 8 13 22...
import java.util.Scanner;
public class L34Fibo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Max series number: ");
		int n= sc.nextInt();

		int a=1,b=1,k=0;
		System.out.print("0 1 1 ");

		while(k<=n)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
	}
}