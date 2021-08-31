//printf in java

public class L16Printf
{
	public static void main(String[] args)
	{
		int i=5;
		int j=3;
		int k=i+j;

		System.out.printf("The sum of %d and %d is:  %d \n", i,j,k);//printf return object of print stream according to its base class(Helps in L25WithoutSemicolon)
		System.out.println("The sum of "+i+" and"+j+" is: "+ k);//return void according to its base class
	}
}