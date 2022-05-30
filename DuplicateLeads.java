package Week2Day2;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DuplicateLeads {
		public static void main(String[] args) {
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
			 
			 driver.findElement(By.linkText("Email")).click();
			 
			 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("volter55@gmail.com");
			 
			 driver.findElement(By.partialLinkText("10024")).click();
		 
			 driver.findElement(By.linkText("Duplicate Lead")).click();
			  
			 driver.getTitle();
				
	     	 driver.findElement(By.className("smallSubmit")).click();
	     	 
			 String dd1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			 System.out.println(dd1);
			 
			 driver.close();
			    
			 
		
		

	}
}
