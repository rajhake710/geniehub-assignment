
abstract interface intr1
{
	abstract void show();
	final static int x=10;
	
}

abstract interface intr2 
{
	abstract void show();
	static int x = 20;
}

class Derived implements intr1,intr2
{
	public void show()
	{
		System.out.println("In intr1 show x = "+intr1.x);
		System.out.println("in intr2 disp y = "+intr2.x);
	}
	
}

class Program7
{
	public static void main(String args[])
	{
		Derived obj = new Derived();
		obj.show();
	}
}
