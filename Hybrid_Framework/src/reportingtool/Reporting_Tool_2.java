package reportingtool;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Reporting_Tool_2 
{
@Test
public void console()
{
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(this.getClass().getName());
	log.error("tc error");
	log.warn("warning while tc runs");
	log.info("info");
	
}
}
