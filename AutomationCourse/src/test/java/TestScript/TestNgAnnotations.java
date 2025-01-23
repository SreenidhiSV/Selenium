package TestScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	@Test
	public void testCase1() {
		System.out.println("TestCase 1");

	}

	@BeforeMethod
	public void before() {
		System.out.println("before");
	}

	@AfterMethod
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite

	public void aftersuite() {
		System.out.println("After suite");
	}
}
