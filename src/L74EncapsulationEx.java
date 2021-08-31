//Without Encapsulation
public class L74EncapsulationEx
{
	public static void main(String args[])
	{
		Emp obj1=new Emp();
		obj1.empId=5;
		obj1.empName= "Tejas";

		System.out.println(obj1.empId);
		System.out.println(obj1.empName);

		Emp obj2=new Emp();
		obj2.empId=6;
		obj2.empName= "Jatin";

		System.out.println(obj2.empId);
		System.out.println(obj2.empName);
	}
}

class Emp
{
	int empId;
	String empName;

}

//With Encapsulation
class L74EncapsulationEx1
{
	public static void main(String args[])
	{
		//ab yha agar object bnake ye likha obje1.empId1(8); to error aa jayegi cos empId1 private variable hai...
		Emp1 obje1 = new Emp1();

		obje1.setempId1(5);
		obje1.setempName1("Tejas");

		System.out.println(obje1.getempId1());
		System.out.println(obje1.getempName1());


		Emp1 obje2 = new Emp1();

		obje2.setempId1(6);
		obje2.setempName1("Jatin");

		System.out.println(obje2.getempId1());
		System.out.println(obje2.getempName1());


	}
}

class Emp1
{
	private int empId1;
	private String empName1;

	public int getempId1()
	{
		return empId1;
	}
	public void setempId1(int empId1)
	{
		this.empId1 = empId1;
	}


	public String getempName1()
	{
		return empName1;
	}
	public void setempName1(String empName1)
	{
		this.empName1=empName1;
	}
}
