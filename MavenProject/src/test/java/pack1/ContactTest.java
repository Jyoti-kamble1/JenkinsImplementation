package pack1;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContact()
	{
		String BROWSER = System.getProperty("browser","chrome");
		System.out.println(BROWSER);
	}
	
	@Test
	public void createContactWithOrg()
	{
		System.out.println("contact created with org ");
	}

}
