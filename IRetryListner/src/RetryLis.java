import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLis {
	
	/*
	 * 1.Manually rerunning the failed test case xml in test output folder\ 2.
	 * IRetryAnalyzer-Create a class and implement the I retry analyzer and add
	 * paramer in @Test annotation like below
	 * 
	 * @Test(retryAnalyzer =RetryAnalyzer.class) 3. IAnnotationTransformer
	 */
	
	
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void testcase2()
	{
		Assert.assertEquals(false, true);
	}
}
