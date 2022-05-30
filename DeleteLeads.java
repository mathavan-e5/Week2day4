package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DeleteLeads {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		 
		
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	    
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 
		
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		
		 driver.findElement(By.linkText("Phone")).click();
		
		
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
		 driver.findElement(By.name("phoneNumber")).sendKeys("89");
		
		
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		
		
		
		 driver.findElement(By.partialLinkText("10474")).click();
		
		 driver.findElement(By.partialLinkText("Delete")).click();
		 
		
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		
		 driver.findElement(By.name("id")).sendKeys("10474");
		 
		
		 driver.findElement(By.linkText("Find Leads")).click();
		  Thread.sleep(3000);
		 
		 
		
		
		  driver.close();
	}



}
