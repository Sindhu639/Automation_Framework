package testng_qsp2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency 
{
@Test
public void compose()
{
	Reporter.log("compose",true);
}
@Test(dependsOnMethods="compose")
public void SentItems()
{
	Reporter.log("sent items",true);
	Assert.fail();
}
@Test(dependsOnMethods="SentItems")
public void trash()
{
	Reporter.log("trash",true);
}

}
