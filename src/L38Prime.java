public class L38Prime
{
	public static void main(String[] args)
	{
		int n=35;
		boolean b=true;

		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				{
					b=false;
					break;
				}
		}

		if(b)
			System.out.println(n+"is prime");

		else
			System.out.println(n+"is not prime");
		
	}
}