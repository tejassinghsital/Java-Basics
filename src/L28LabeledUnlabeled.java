// Unlabeled Break Statements
public class L28LabeledUnlabeled
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
				if(i==3)
					break; // this is unlabeled break statement and it doesn't print 3 row of stars
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}
}

// Labeled Break Statement
class L28LabeledUnlabeled1
{
	public static void main(String[] args)
	{
		tejas:
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=4; j++)
			{
				
				if(i==3)
					break tejas;//this is labeled break statement and it doesn't print 3 and 4th row of stars cos takes compiler out of the main loop to tejas: label
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}
}



























// Labeled Break Statements