package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ImageHtml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//label[contains(text(),'home')]/following-sibling::img")).click();
		
		driver.navigate().back();

		driver.findElement(By.xpath("//label[contains(text(),'Broken')]/following-sibling::img")).click();
		String title = driver.getTitle();
		String pageTitle="TestLeaf - Interact with Images";
		
		if(title.equals(pageTitle)) {
			System.out.println("the image is broken");
		}
		
			driver.switchTo().activeElement().findElement(By.xpath("//label[contains(text(),'Keyboard')]/following-sibling::img")).click();
	}


	
		
		
	

}
