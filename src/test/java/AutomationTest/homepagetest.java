package AutomationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.homepage;
import Automation.homepageobject;

public class homepagetest {
	homepage hp;
	homepageobject hpo;
	
public homepagetest(){
	hp=new homepage();
	hpo=new homepageobject();
}

@Test 
 public void verifytab()
{
	Assert.assertTrue(hpo.getwomentitle().isDisplayed());
	Assert.assertTrue(hpo.getdresstitle().isDisplayed());
	Assert.assertTrue(hpo.gettshirttitle().isDisplayed());
}
@Test
public void verifyclick()
{
hpo.clickwomen();
Assert.assertTrue(hpo.getTitlte().contains("Women"));
hpo.clickdress();
Assert.assertTrue(hpo.getTitlte().contains("Dresses"));
hpo.clicktshirt();
Assert.assertTrue(hpo.getTitlte().contains("T-shirt"));
}










}
