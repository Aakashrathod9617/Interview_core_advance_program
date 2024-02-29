package in.co.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
	@BeforeClass
	public static void BeforeClassMethod() throws Exception{
		System.out.println("Before Class");
	}
  
	@Before
	public  void BeforeTest() throws Exception{
		System.out.println("Before");
	}
	@AfterClass
	public  static void AfterClassMethod()throws Exception {
		System.out.println("After Class");
	}
	@After
	public  void AfterTest()throws Exception {
		System.out.println("After");
	}
	@Test
	public  void new1() {
	 System.out.println(in.co.junit.Test.add(1, 2));
	}
	
}
