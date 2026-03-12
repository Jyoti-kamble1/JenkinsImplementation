package pack1;

import org.testng.annotations.Test;

public class ContactTestProfillingTest 
{
	@Test(groups = "FRT")
	public void createContact()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		System.out.println("FULL REGRATION TEST:-->Executing contact test for profiling");
	}
	
	@Test(groups = "ST")
	public void createContactWithOrg()
	{
		System.out.println("SMOKE TEST:--> Executing create contact test for profilling  ");
	}

}
