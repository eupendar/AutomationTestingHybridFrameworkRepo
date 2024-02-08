package TestCase1;

import org.testng.annotations.Test;

public class HelloTestCase {

	@Test (priority =2)
	public void TestCase1() {
	System.out.println("Hello testCase123");}
	
	@Test(priority =1)
	public void TestCase2() {
		System.out.println("Hello testCase124");}
		
		@Test(priority =1)
		public void TestCase3() {
			System.out.println("Hello testCase124");
	}
	
	
}
