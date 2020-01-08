package AutomationTest;

import org.junit.Test;

import Automation.homepage;
import Automation.homepageobject;
import Automation.procounobj;

public class procoutest {
	homepage hp;
	procounobj pco;
	homepageobject hpo;
	public procoutest(){
		hp=new homepage();
		pco =new procounobj();
		hpo=new homepageobject();
	}
	
	@Test
	public void verify(){
		hpo.clickwomen();
		System.out.println(pco.image());
		System.out.println(pco.count());
	}

}
