import org.testng.annotations.Test;

public class Timeouts {

	@Test(timeOut = 1000)
	public void testcase1() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("hello");
	}
}
