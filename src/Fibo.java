import java.util.Scanner;
public class Fibo
{
	public static void main(String[] args) 
		{

			int k=0,a=1,b=1;

			Scanner s= new Scanner(System.in);
			System.out.println("Enter max. no.:");
			int i= s.nextInt();

			System.out.print("1 1 ");
			while(k<=50)
			{
				k=a+b;
				if(k>=i)
					break;
				System.out.print(k+" ");
				a=b;
				b=k;
			}
		}
}
