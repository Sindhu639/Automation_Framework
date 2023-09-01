package pom_script_package;

import org.testng.annotations.Test;

public class Groups 
{
@Test(groups= {"functional"})
public void test1()
{
	System.out.println("compose");
}
@Test(groups= {"sanity","regression"})
public void test2()
{
	System.out.println("sentitems");
}
@Test(groups= {"regression"})
public void test3()
{
	System.out.println("trash");
}
}
