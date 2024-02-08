package TestCase1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnTestCase {
@BeforeMethod()
	public void startup(){
	System.out.println(" Welocme");}

	@AfterMethod()
	public void shutsown(){
		System.out.println("Shutdown");
	}
	@Test
public void TestCase1() {
	System.out.println("Ann TestCase 143 ");}
	
@Test
	public void TestCase3() {
		System.out.println("Ann TestCase 123 ");}
	
@Test
public void TestCase4() {
	System.out.println("Ann TestCase 128 ");}
}
	

