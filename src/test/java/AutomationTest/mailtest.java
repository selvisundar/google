package AutomationTest;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.homepage;
import Automation.mailobject;
import Automation.mailsubobj;

public class mailtest {
	homepage hp;
	mailobject mo;
	mailsubobj mso;
	
public mailtest(){
	hp=new homepage();
	mo=new mailobject();
	mso=new mailsubobj();
}

@Test
public void verify()
{
	mo.email();
	mo.clickbtn();
	Assert.assertTrue(mso.getverify().getText().contains(" Newsletter : You have successfully subscribed to this newsletter."));
}

}
