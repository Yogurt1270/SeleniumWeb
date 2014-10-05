package practiceone.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPractice1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite_001");
	}
	
	@BeforeTest
	public void testCaseAnnotationBeforeTest() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void testCaseAnnotationBeforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void testCaseAnnotationBeforeMethod() {
		System.out.println("BeforeMethod1");
	}

	@Test
	public void testCaseAnnotationTest001() {
		System.out.println("Test_0011");
	}

	@Test
	public void testCaseAnnotationTest002() {
		System.out.println("Test_0021");
	}

	@AfterMethod
	public void testCaseAnnotationAfterMethod() {
		System.out.println("AfterMethod1");
	}
	
	@AfterClass
	public void testCaseAnnotationAfterClass() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void testCaseAnnotationAfterTest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite_001");
	}
}