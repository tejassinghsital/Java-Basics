//While loop for printing 1 to 10 numbers on screen
public class L27WhileDowhileFor
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
}

// Do while loop for printing 1 to 10 numbers on screen

class L27WhileDowhileFor1
{
	public static void main(String[] args)
	{
		int j=1;
		do
		{
			System.out.println(j);
			j++;
		}while(j<=10);
	}
}
/* Suppose i and j =15 in both above programs then while loop doesn't print anything but do while loop print 15 and the nothing cos 
it checks condition after first value means at the end and not in starting like while loop*/

// For loop for printing 1 to 10 numbers

class L27WhileDowhileFor2
{
	public static void main(String[] args)
	{
		int k=1;
		for(;k<=10;k++)
		{
			System.out.println(k);
		}
	}
}