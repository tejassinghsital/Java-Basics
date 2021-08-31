public class L37Armstrong
{
	public static void main(String[] args)
	{
		int n=150,r,t=0;
		int s=n;

		while(n>0)
		{
			r=n%10;
			n=n/10;
			t=t+r*r*r;
		}

		if(s==t)
			System.out.println("No. is Armstrong");
		else
			System.out.println("It's not");
	}
}