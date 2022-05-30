package Week2Day2;

import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edithtml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("volthatter55@gmail.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='email']//following::input"));
		element.sendKeys(Keys.HOME+"mathavan");
		
		driver.findElement(By.name("username")).getAttribute("value");
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
		
		
		
		
		
		
	}

}
