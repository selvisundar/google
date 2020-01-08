package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcardobj1 extends homepage{
	@FindBy(xpath="//h2")
    private WebElement verify;
	public addcardobj1(){
		PageFactory.initElements(driver, this);
	}
	public WebElement getverify(){
		return verify;
	}
}
