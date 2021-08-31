public class L36Perfect
{
	public static void main(String[] args)
	{
		int n=25;

	boolean b= isPerfect(n);

	if(b)
		System.out.println("The number is perfect");
	else
		System.out.println("It's not");
	}


	public static boolean isPerfect(int n)
		{
			int sum=0;
			for(int i=1;i<n;i++)
				{
					if(n%i==0)
					{
						sum=sum+i;
					}

				}

			if(n==sum)
				return true;
			else
				return false;
		}

}