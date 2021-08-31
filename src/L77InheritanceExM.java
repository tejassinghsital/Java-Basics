
//Using L76 Later Inheritance code for Multi Level Inheritance

class L77InheritanceExM
{
	public static void main(String args[])
	{
		// previously written for class Add --> Add obj=new Add();
		AddSubMul1 obj1=new AddSubMul1();
		obj1.val1=5;
		obj1.val2=6;
		obj1.sum();
		System.out.println(obj1.result1);

		obj1.sub();
		System.out.println(obj1.result1);

		obj1.mul();
		System.out.println(obj1.result1);
	}
}

class Add1// Parent/Super/Base Class for AddSub1
{
	int val1,val2,result1;
	public void sum()
	{
		result1=val1+val2;
	}
}

/*but now client requires an additional feature of substraction and by chance suppose Add class source code in on another package and it gots lost
only it's .class file is given by client */

//Parent/Super/Base Class for AddSubMul1 but Child/Sub/Derived Class for Add1
class AddSub1 extends Add1 //Single Level Inheritance
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

//Child/Sub/Derived Class for AddSub1 and Add1 is grandparent of AddSubMul1😜 
class AddSubMul1 extends AddSub1 // Multi-Level Inheritance
{
	public void mul()
	{
		result1=val1*val2;
	}
}
