class Base
{
	static void base()
	{
		System.out.println("IN BASE");
	}
}

class Myclass extends Base
{
	int x;
	static void print()
	{
		System.out.println("IN Myclass print");
	}
}
class Inheri 
{
	public static void main(String args[])
	{
		Myclass d = new Myclass();
		
		d.print();
		d.base();
	}
}
