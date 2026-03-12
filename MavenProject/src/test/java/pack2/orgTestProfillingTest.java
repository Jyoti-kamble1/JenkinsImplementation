package pack2;

import org.testng.annotations.Test;

public class orgTestProfillingTest 
{
	@Test(groups = "FRT")
	public void createOrg()
	{
		System.out.println("FULL REGRATION TEST:-->Executing create org test for profiling ");
	}
	
	@Test(groups = "ST")
	public void createOrgWithContact()
	{
		System.out.println("SMOKE TEST:--> Executing create org with conatct test for pofilling  ");
	}

}
