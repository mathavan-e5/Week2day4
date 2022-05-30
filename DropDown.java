package Week2Day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DropDown {
	 
    public static final WebElement ElementDropDown = null;

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			
			WebElement findElement = driver.findElement(By.id("dropdown1"));
			Select dd1=new Select(findElement);
			dd1.selectByValue("2");
			
			WebElement findElement2 = driver.findElement(By.id("dropdown2"));
			Select dd2=new Select(findElement2);
		
			dd2.selectByValue("1");
			
	 }

}
