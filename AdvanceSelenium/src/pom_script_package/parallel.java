package pom_script_package;

import java.util.Properties;

import org.testng.annotations.Test;

public class parallel 
{
@Test
public void test1()
{
	Properties p=new properties();
	p.load(new FileInputstream("./p.properties"));
}

}
