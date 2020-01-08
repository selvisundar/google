package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	public WebDriver driver;
	@BeforeMethod
	public void launch(){
		System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome 79\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");}
		@org.testng.annotations.DataProvider(name="verifylogin")
	public Object[][]getdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin1";
		data[1][1]="admin12";
		data[2][0]="Admin2";
		data[2][1]="admin23";
		
		return data;
		
	}
	@Test(dataProvider="verifylogin")
	public void verifylogin(String Username,String  Password){
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys( Password);
		driver.findElement(By.id("btnLogin")).click();
	}

}



