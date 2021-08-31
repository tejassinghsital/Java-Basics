/* Number pattern 1:

1234
2341
3412
4123
*/
// With 3 for loops
public class L30NumberP1
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int p=1;
			for(int j=i;j<=n;j++)
			{
			System.out.print(j);
			}/* this both above for loops prints:
						1234
						234
						34
						4
							*/

			for(int j=1;j<i;j++)/* this prints    1
												1 2
											  1 2 3*/
			{
				System.out.print(p++);
			}
			System.out.println();
		}
	}
}
