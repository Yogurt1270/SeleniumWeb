package practiceone;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
	
	@BeforeSuite
	public void testCaseAnnotationBeforeSuite(){
		System.out.println("Annotation BeforeSuite");
	}
	
	@BeforeTest
	public void testCaseAnnotationBeforeTest(){
		System.out.println("Annotation BeforeTest");
	}
	
	@BeforeClass
	public void testCaseAnnotationBeforeClass(){
		System.out.println("Annotation BeforeClass");
	}
	
	@BeforeMethod
	public void testCaseAnnotationBeforeMethod(){
		System.out.println("Annotation BeforeMethod");
	}
	
	@Test
	public void testCaseAnnotationTest001(){
		System.out.println("Annotation Test_001");
	}
	
	@Test
	public void testCaseAnnotationTest002(){
		System.out.println("Annotation Test_002");
	}
	
	@AfterMethod
	public void testCaseAnnotationAfterMethod(){
		System.out.println("Annotation AfterMethod");
	}
	
	@AfterClass
	public void testCaseAnnotationAfterClass(){
		System.out.println("Annotation AfterClass");
	}
	
	@AfterTest
	public void testCaseAnnotationAfterTest(){
		System.out.println("Annotation AfterTest");
	}
	
	@AfterSuite
public void testCaseAnnotationAfterSuite(){
		System.out.println("Annotation AfterSuite");
	}
}