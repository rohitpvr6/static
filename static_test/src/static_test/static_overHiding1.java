package static_test;

import java.io.IOException;
import static java.lang.Math.*;

public class static_overHiding1 {
	final static int x=10;
	
	static void show()throws Exception
	{
		
		
		System.out.println(sqrt(7));
		System.out.println("staic_overHiding1 show"+x);
		
	}
	

}

class static_overHiding2 extends static_overHiding1
{
	
	static void show() throws IOException
	{
		
		
		System.out.println("staic_overHiding2 show");
		
	}
	

	public static void main(String[] args) throws Exception,ArithmeticException {
		
		static_overHiding2 st2=new static_overHiding2();
		static_overHiding1 st1=new static_overHiding2();
		static_overHiding2.show();
		st1.show();
	
	}
	
	
}
