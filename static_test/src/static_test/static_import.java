package static_test;
import static java.lang.Math.*;

import static java.lang.System.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;

public class static_import {

	public void finalize()
	{
		
		System.out.println("this is finalize");
		
	}
	
	public static void main(String[] args) {
static_import ss=new static_import();
ss=null;
		gc();

		int MAX_VALUE=524;
		
/*		System.out.println(sqrt(5));
		System.out.println(random());
System.out.println(Math.max(512, 74));
out.println(min(8546, 3655));*/
out.println(MIN_VALUE);
out.println(MAX_VALUE);
Runtime r=Runtime.getRuntime();
Runtime s=Runtime.getRuntime();
out.println(r+"   "+s);

	
	}

}
