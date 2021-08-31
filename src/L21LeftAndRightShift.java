// Left Shift Operator
public class L21LeftAndRightShift
{
	public static void main(String[] args)
	{
		int a=8;
		a=a<<2; //shifts 8's binary by 2 in left ex: 8-> 1000 to 100000 means adds 2 extra zeroes from right ot left means from after decimal point 10000.00 to befor decimal point
		System.out.println(a);
	}
}// left shift only add zeroes and not ones

// Right Shift Operator 

class L21LeftAndRightShift1
{
	public static void main(String[] args)
	{
		int b=8;
		b=b>>2;// shift two digits(Doesn't matter zeroes or ones) from left side of decimal point ot right side ex: 8->1000.00 to 10.0000
		System.out.println(b);
	}
}
