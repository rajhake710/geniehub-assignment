

abstract class Base 
{
	abstract void show();
	Base()
	{
		System.out.println("show in base 11");
		disp();
	}
	
	void disp()
	{
		System.out.println("In base disp");
	}
}

class Derived extends Base
{
	void show()
	{
		System.out.println("show in base");
	}
	
}

class Program6
{
	public static void main(String args[])
	{
		Derived obj = new Derived();
		obj.show();
	}
}
