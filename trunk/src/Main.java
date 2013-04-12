import org.apache.log4j.Logger;

import com.friskwave.gcj.problems.BogTrust.BogTrust;
import com.friskwave.gcj.utils.ApplicationConstants;
import com.friskwave.utils.LoggerUtil;

public class Main {
	
	private static final Logger LOG = LoggerUtil.getInstance();
	
	public static void main(String[] args) {
		
		LOG.info("Calling ApplicationConstants.initializeConstants() from main() method");
		ApplicationConstants.initializeConstants();
		
		LOG.info("Execution of code to compute soluation for GoogleCodeJam problem starts");
		
		// compute output by calling appropriate class object function
		BogTrust smallDataset = new BogTrust(ApplicationConstants.defaultSmallInputFilePath, ApplicationConstants.defaultSmallOutputFilePath);
		BogTrust largeDataset = new BogTrust(ApplicationConstants.defaultLargeInputFilePath, ApplicationConstants.defaultLargeOutputFilePath);
		
		LOG.info("Execution of code to compute soluation for GoogleCodeJam problem ends");
	}
}