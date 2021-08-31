import java.util.Scanner;

public class L35Palindrome
{
	public static void main(String[] args)
	{
		int n,r,s=0,t=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		n= sc.nextInt();

		t=n;

		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}

		if(s==t)
			System.out.println("Number is palindrome");

		else
			System.out.println("Number is not palindrome");

	}
}