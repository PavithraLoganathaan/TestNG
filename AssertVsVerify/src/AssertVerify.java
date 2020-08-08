import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {

	
	@Test
	public void testcase1()
	{
		System.out.println("Before Assertion");
		Assert.assertEquals(true, false);
		System.out.println("After Assertion");
	}
	
	@Test
	public void testcase2()
	{
	
		SoftAssert assert1=new SoftAssert();
		System.out.println("Before Assertion");
		assert1.assertEquals(true, false);
		System.out.println("After Assertion");
		
	}
}
