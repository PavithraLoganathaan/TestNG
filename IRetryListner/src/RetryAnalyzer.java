import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int failedcount=0;
	int limit=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(failedcount<limit)
		{
			failedcount++;
		return true;
		}
		else
		{
			return false;
		}
	}

}
