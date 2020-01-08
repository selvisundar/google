package Automation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class procounobj extends homepage {
	@FindBy(xpath="//span[@class='heading-counter']")
    private WebElement  sevpro;
	
	@FindBys(@FindBy(xpath="//img[@title='Blouse']"))
    private List<WebElement> image;
	
	public procounobj(){
		PageFactory.initElements(driver, this);
	}
	public int count()
	{
		String value=sevpro.getText();
		String[] v=value.split(" ");
		int t=Integer.parseInt(v[2]);
		return t;
	}
	
	public int image(){
		return image.size();
	
	}

}
