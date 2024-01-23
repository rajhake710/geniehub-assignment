

class Program12
{
	public static void main(String args[])
	{
		
		int num[] = new int[5];
		
		try
		{
			myFun();
			System.out.println("below myFun()");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception in main try catch :: "+e);
		}
		
		System.out.println("main ends");
		
		
	}
	
	static void myFun()
	{
		int res,a=10;
		try
		{
			res=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("in myfun catch");
		}
			System.out.println("myfun complete");
	}
	
}
