package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Parameter {public WebDriver driver;
@BeforeMethod
public void launch(){
	System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome 79\\Chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
@Test
@org.testng.annotations.Parameters({"UserName,PassWord"})
public void verifylogin(String UserName,String Password){
	driver.findElement(By.id("txtUsername")).sendKeys(UserName);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
}

}

