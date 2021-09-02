/* star pattern for printing diamond of stars like this:

        *
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

HINT: If you observe this diamond shape it actually makes of 2 parts:

1. Upper: 1 lower traingle of spaces and 1 upper trangle of star then another upper trainale of star

2. Lower: 1 upper traingle of space then 2 lower triangle of stars
*/

public class L28StarPatternsB4
{
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)// this is for entire upper rows and i<5 insted of i<=5 for removing one middle horizontal line
		{
			for(int j=i;j<=5;j++)// this makes the lower triangle of spaces of upper body
			{
				System.out.print(" "+" ");
			}

			for(int j=1;j<=i;j++)// this for loop makes 1 upper triangle with stars
			{
				System.out.print("*"+" ");
			}

			for(int j=1;j<i;j++)// this for loop makes 2nd upper triangle with stars and we also write j<i instead of j<=i for 1 less mid column
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}


		for(int i=1;i<=5;i++)// this loop for lower rows
		{
			for(int j=1;j<=i;j++)// this is for upper space triangle in lower diamond section
			{
				System.out.print(" "+" ");
			}

			for(int j=i;j<=5;j++)// this is for lower triangle in lower diamond section
			{
				System.out.print("*"+" ");
			}

			for(int j=i;j<5;j++)// this is also for 2nd lower triangle in lower diamond section and j<5 for removing extra star line...
			{
				System.out.print("*"+" ");
			}

			System.out.println(" ");
		}
	}
}