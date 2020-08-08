import org.testng.annotations.Test;

public class InvokationCount {
	@Test(invocationCount = 3)
	public void testcase1() throws InterruptedException
	{
		
		System.out.println("hello");
	}
}
