package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailobject extends homepage {
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement clickbtn;
	
public mailobject(){
		PageFactory.initElements(driver, this);
	}
	    public WebElement getemail(){
	    	email.sendKeys("deephi26@gmail.com");
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
