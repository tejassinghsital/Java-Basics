// odd even program with If and else conditions
import java.util.Scanner;
public class L23IfElse
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");

		int i= sc.nextInt();

		if(i%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}
}

// 3 number comparison and show highest number with If,Else and Else If 

class L23IfElse1
{
	public static void main(String[] args)
	{
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("Eneter 1st number: ");
		int a = sc1.nextInt();
		
		System.out.println("Eneter 2nd number: ");
		int b= sc1.nextInt();
		
		System.out.println("Eneter 3rd number: ");
		int c= sc1.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+ " is the greatest number.");
		else if(b>c)
			System.out.println(b+" is the greatest number.");
		else
			System.out.println(c+" is the greatest number.");
	}
}
