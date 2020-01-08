package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailsubobj extends homepage{
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement verify;
	
	public mailsubobj(){
		PageFactory.initElements(driver,this);
	}
	public WebElement getverify(){
		return verify;
	
	}

}
