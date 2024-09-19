package Module_4;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Module_4.AddListner.class)
public class Listner
{

	@Test
	void pass()
	{
		System.out.println("Pass");
	}
	@Test
	void fail()
	{
		Assert.assertTrue(false);
	}
	@Test
	void skipped()
	{
		throw new SkipException("skipped");
	}

}
