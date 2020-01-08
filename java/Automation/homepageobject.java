package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends homepage{
	
     @FindBy(xpath="//a[@title='Women']")
     private WebElement women;

     @FindBy(xpath="(//a[@title='Dresses'])[2]")
     private WebElement dress;

     @FindBy(xpath="(//a[@title='T-shirts'])[2]")
     private WebElement tshirt;
     
public homepageobject(){
	PageFactory.initElements(driver, this);
}
    public WebElement getwomentitle(){
    	return women;
    }

    public WebElement getdresstitle(){
    	return dress;
    }
    public WebElement gettshirttitle(){
    	return tshirt;
    }

    public void clickwomen(){
    	women.click();
    	
    }
    public void clickdress(){
    	dress.click();
    	
    }
    public void clicktshirt(){
    	tshirt.click();
    	
    }















}
