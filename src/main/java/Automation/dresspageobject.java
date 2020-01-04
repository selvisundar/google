package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dresspageobject extends homepage{
	 
     @FindBy(xpath="//body[@id='category']")
     private WebElement ssize;

     @FindBy(xpath="//body[@id='category']")
     private WebElement msize;
    
	 @FindBy(xpath="//body[@id='category']")
	 private WebElement lsize;
	
public dresspageobject(){
			PageFactory.initElements(driver, this);
		}
		    public WebElement getssize(){
		    	return ssize;
		    }

		    public WebElement getmsize(){
		    	return msize;}

		    public WebElement getlsize(){
				return lsize ;}


}
