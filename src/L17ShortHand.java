// All short hand operators
public class L17ShortHand
{
	public static void main(String[] args)
	{
		int i=15;
		int i+=2;
		int i-=2;
		int i/=2;
		int i%=2;
	}
}

//then suppose byte b=8 then is b=b*2.5; or b*=2.5 is same?

class L17ShortHand2
{
	public static void main(String[] args)
	{
		byte b=8;
		b=b*2.5;//this gives error cos in b*2.5 the type is for whole value
		b*=2.5;//this one successfully exectues cos here the type is for only b although i don't understand it so ask to expert if found one...
		System.out.println(b);
	}
}