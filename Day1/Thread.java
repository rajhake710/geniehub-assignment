
class Mythread extends Thread
{	
  public boolean value;
	public Mythread()
	{		value=true;
	}
	
	public void run()
	{
		int i=0;
		while(value)
		{
			i++;
			System.out.println(Thread.currentThread().getName()+" = "+i);
		}
	}
}
class Thread4
{
	public static void main(String args[]) throws InterruptedException
	{
		Mythread obj = new Mythread();
		Thread t = new Thread(obj,"first");
		t.start();
		Thread.sleep(40);
		obj.value=false;
		System.out.println("main ends");
	}
}
