import java.util.Scanner;
public class L26SwitchCase
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number between 1 to 5: ");
		int i=sc.nextInt();
		switch(i)
		{
			case 0: System.out.println("The number is Zero. ");
					break;

			case 1: System.out.println("The number is One. ");
					break;

			case 2: System.out.println("The number is Two. ");
					break;

			case 3: System.out.println("The number is Three. ");
					break;

			case 4: System.out.println("The number is Four. ");
					break;

			case 5: System.out.println("The number is Five. ");
					break;

			default: System.out.println("Please enter a valid number between 1 to 5");
					break;			
		}
	}
}

// Switch Case support strings too

class L26SwitchCase1
{
	public static void main(String[] args)
	{
		String s="Hello";

		switch(s)
		{
			case "Hello": System.out.println("Hello");
						break;
			default: System.out.println("Hi");
						break;
		}
	}
}