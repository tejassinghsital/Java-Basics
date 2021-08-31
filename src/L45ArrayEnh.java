public class L45ArrayEnh
{
	public static void main(String[] args)
	{
		int a[]= new int[5];


		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}

		for(int i :a)
		{
			System.out.println(i);
		}

	}
}