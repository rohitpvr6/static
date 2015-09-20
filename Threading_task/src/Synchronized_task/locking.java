package Synchronized_task;

public class locking extends Thread {
	synchronized static void test1()
	{
		for(int i=0;i<5;i++)
			System.out.println(i);
		test2();
		
		
	}
	synchronized static void test2()
	{
		System.out.println("test2");
		
		for(int i=0;i<5;i++)
			System.out.println("rohit");
		
	}
	void test3()
	{
		System.out.println("test3");
		
		
		
	}
	public void run()
	{
		
		test1();
		
	}
	

	public static void main(String[] args) {
		
	locking l1=new locking();
	locking l2=new locking();
	locking l3=new locking();
	l1.start();
	l2.test2();
	//l3.start();
		
	}

}
