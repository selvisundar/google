package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailobject extends homepage {
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement email;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement clickbtn;
	
public mailobject(){
		PageFactory.initElements(driver, this);
	}
	    public WebElement getemail(){
	    	email.sendKeys("selvisundar25@gmail.com");
	    	return email;
	    }

	    public WebElement getclick(){
	    	return clickbtn;}
	    
	    public void email(){
	    	email.click();}
	    public void clickbtn(){
	 	    clickbtn.click();
	    	
	    }



}
