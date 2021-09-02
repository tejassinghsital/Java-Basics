/* star pattern for printing lower triangle of stars like this:

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class L28StarPatternsB3
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("*"+" ");
			}
		System.out.println(" ");
		}
	}
}
