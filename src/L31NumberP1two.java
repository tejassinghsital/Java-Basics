/* Number pattern 1:

1234
2341
3412
4123
*/
// With 2 for loops and if else

class L31NumberP1two
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				int k=i+j-1;
				if(k>4)
					System.out.print(k-4+"");
				else
					System.out.print(k+"");
			}
			System.out.println();
		}
	System.out.println();
	}
}