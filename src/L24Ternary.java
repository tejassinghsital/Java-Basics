// Ternary operator i.e ?:
// Code with if else
public class L24Ternary
{
	public static void main(String[] args)
	{
		int i=1;
		int j=5;

		if(i==1)
			j=6;
		else
			j=7;
		System.out.println(j);
	}
}
// Same code using Ternary operator

class L24Ternary1
{
	public static void main(String[] args)
	{
		int i=1;
		int j=5;

		j=(i==1)?6:7;// ERROR: Int cannot be converted to boolean
		System.out.println(j);
	}
}


// Is ternary operator a alternative to If else?

class L24Ternary2
{
	public static void main(String[] args)
	{
		boolean c=true;
		Object obj1=0;
		Object obj2=0;
		
		if(c==true)
			obj1=new Integer(10);
		else
			obj2=new Double(3.5);
		
		System.out.println(obj1);// gives output as 10

		obj2=true?new Integer(10): new Double(3.5);
		System.out.println(obj2);//gives output as 10.0 cos ternary operator gives highest datatype to output value and in this case highest output is 10.0 cos of double
	}
}