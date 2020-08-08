import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwasyRun {
	
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods = "testcase1",alwaysRun = true)
	public void testcase2()
	{
		System.out.println("tc2");
	}

}
