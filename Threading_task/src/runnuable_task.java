
public class runnuable_task implements Runnable {
	@Override
	public void run() {
		System.out.println("hi");
		
	}
	
	public static void main(String[] args) {
		
		runnuable_task r=new runnuable_task();
		Thread t=new Thread(r);
		t.start();
		
		System.out.println(t.toString());
		Thread t1=new Thread(r);
		System.out.println(t1.toString());
		
		

	}



}
