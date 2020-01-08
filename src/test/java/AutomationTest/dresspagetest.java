package AutomationTest;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.dresspageobject;
import Automation.homepage;
import Automation.homepageobject;

public class dresspagetest {
	homepage hp;
    dresspageobject dpo;
    homepageobject hpo;
    
 public dresspagetest()
 {
	hp=new homepage();
	dpo=new dresspageobject();
	hpo=new homepageobject();
 } 
 
 @Test
 public void verifysize(){ hpo.clickdress();
	Assert.assertTrue(dpo.getssize().isDisplayed());
	Assert.assertTrue(dpo.getmsize().isDisplayed());
	Assert.assertTrue(dpo.getlsize().isDisplayed());
	
	
	
	
 }}
 
 
 
 
 
 

