//Without Inheritance

public class L76InheritanceEx
{
	public static void main(String args[])
	{
		// previously written for class Add --> Add obj=new Add();
		AddSub obj=new AddSub();
		obj.value1=5;
		obj.value2=6;
		obj.sum();
		System.out.println(obj.result);

		obj.sub();
		System.out.println(obj.result);
	}
}

class Add
{
	int value1,value2,result;
	public void sum()
	{
		result=value1+value2;
	}
}

/*but now client requires an additional feature of substraction and by chance suppose Add class source code in on another package and it gots lost
only it's .class file is given by client */

class AddSub
{
	int value1,value2,result;
	public void sum()
	{
		result=value1+value2;
	}

	public void sub()
	{
		result=value2-value1;
	}
} 


//With Inheritance

class L76InheritanceEx1
{
	public static void main(String args[])
	{
		// previously written for class Add --> Add obj=new Add();
		AddSub1 obj1=new AddSub1();
		obj1.val1=5;
		obj1.val2=6;
		obj1.sum();
		System.out.println(obj1.result1);

		obj1.sub();
		System.out.println(obj1.result1);
	}
}

class Add1
{
	int val1,val2,result1;
	public void sum()
	{
		result1=val1+val2;
	}
}

/*but now client requires an additional feature of substraction and by chance suppose Add class source code in on another package and it gots lost
only it's .class file is given by client */

class AddSub1 extends Add1
{
	/* IN THIS CASE DON'T YOU THINK THIS CODE IN THIS COMMENT BLOCK IS REPEATING FROM CLASS ADD AND YES WE HAVE IT'S .CLASS FILE SO WHY NOT JUST
	WRITE EXTENDS A AND INHERT THAT CLASS FEATURE HERE AND WE ARE DOING EXACTLY SAME THAT'S WHY THIS CODE IS IN COMMENT BLOCK.😜
	
	int val1,val2,result1;
	public void sum()
	{
		result=value1+value2;
	}
*/
	public void sub()
	{
		result1=val2-val1;
	}
} 

