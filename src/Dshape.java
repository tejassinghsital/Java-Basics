public class Dshape
{
	public static void main(String[] args) 
	{
		
		int n=5,i,j,k,l,;

		for(i=1;i<n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" ");
			}

			for(k=1;k<i;k++)
			{
				System.out.print("*");
			}

			for(l=1;l<=i;l++)
			{
				System.out.print("*");
			}
		System.out.println();
		}


		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(k=i;k<n;k++)
			{
				System.out.print("*");
			}

			for(l=i;l<=n;l++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}
}