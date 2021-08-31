//Float in java
public class L9FloatDoubleChar
{
	public static void main(String[] args)
	{
		float num1=3.3f;/* we have to write f after variable values in case of float cos java by default takes double for point values
						hence even with float datatype it shows error.*/
		float num2=4.3f;

		System.out.println(num1+num2);
	}
}

//Double in java
class L9FloatDoubleChar1
{
	public static void main(String[] args)
	{
		double num3= 3.3;
		double num4= 4.3;
		System.out.println(num3+num4);
	}
}

//Char in java
class L9FloatDoubleChar2
{
	public static void main(String[] args)
	{
		char c='A';/*Remember "" denotes string and '' denotes char value in java and if you use like c="A" then it'll show error that String value
				cannot get converted into char*/
		System.out.println(c);
	}
}

// ASCII representation of char values(Means how these characters converted to binary using American Standard Code for Information Interchange)
class L9FloatDoubleChar3
{
	public static void main(String[] args)
	{
		char a='A';
		System.out.println((int)a);// that's how we can can find which alphabet/symbol is reperesented by which number
	}
}

// We can also write above program for numbers ex:

class  L9FloatDoubleChar4
{
	public static void main(String[] args)
	{
		int num5=67;
		System.out.println((char)num5);
	}
}
