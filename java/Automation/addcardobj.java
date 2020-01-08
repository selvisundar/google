package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcardobj extends homepage{
	@FindBy(xpath="//img[@class='replace-2x img-responsive']")
    private WebElement image;
	
	@FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
    private WebElement addtocard;
	
	public addcardobj(){
		PageFactory.initElements(driver, this);
	}
	
	
	  public void clickaddcard(){
		  addtocard.click();
	  }
	   	
	    				

}
