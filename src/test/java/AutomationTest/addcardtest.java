package AutomationTest;

import org.junit.Test;

import Automation.addcardobj;
import Automation.addcardobj1;
import Automation.homepage;
import junit.framework.Assert;

<<<<<<< HEAD
public class addcardtest12 {
	mmaddcardobj ac;
=======
public class addcardtest {
	mmmmaddcardobj ac;
>>>>>>> 58edadfdae11828c51082ed2caaf0c800b2a5c19
	addcardobj1 ac1;
	homepage hp;
	
	public addcardtest(){
		ac=new addcardobj();
		ac1=new addcardobj1();
		hp=new homepage();
	}
	@Test
	public void verify(){
		ac.clickaddcard();
		ac1.getverify();
		Assert.assertTrue(ac1.getverify().getText().contains("Product successfully added to your shopping cart"));

	}

}
