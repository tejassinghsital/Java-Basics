public class Unique
{
	public static void main(String[] args) 
	{
		
		int n=5,i,j,k,l;

		for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(j=1;j<=n-i;j++)
			{
				System.out.print("*"+" ");
			}

		System.out.println();
		}
	}
}