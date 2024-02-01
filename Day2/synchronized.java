
class ThirdParty
{	int x=1;
	synchronized public void change()
	{		int i=1;
		
		for(i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+x);
			x++;
		}
	}
}
class SynchClass extends Thread
{
	int x=1;
	ThirdParty ref;
	
	public SynchClass(ThirdParty temp)
	{
		ref = temp;
	}
	
	public void run()
	{
		ref.change();
	}
}

class Thread2
{
	public static void main(String args[]) throws InterruptedException
	{
		ThirdParty var = new ThirdParty();
		
		SynchClass obj1 = new SynchClass(var);
		SynchClass obj2 = new SynchClass(var);
		SynchClass obj3 = new SynchClass(var);
		
		Thread t1,t2,t3;
		t1 = new Thread(obj1,"first");
		t2 = new Thread(obj2,"second");
		t3 = new Thread(obj3,"third");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(25);
		System.out.println("first ki state = "+t1.getState());
		System.out.println("second ki state = "+t2.getState());
		System.out.println("third ki state = "+t3.getState());
	}
}
