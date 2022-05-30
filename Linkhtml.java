package Week2Day2;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Linkhtml {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		
		System.out.println(driver.findElement( By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		String title= driver.getTitle();
		String pageTitle="404 Not Found";
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		if(title.equals(pageTitle)) {
			System.out.println("image is broken");
			
		}
		
		
        driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		 
		List links= (List) driver.findElements(By.tagName("a"));
		System.out.println("numberof links are:"+links.getSize());
		
		
		
	}
	
	
}
