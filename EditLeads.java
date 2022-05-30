package Week2Day2;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class EditLeads {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			 
			 
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			 
			 
		     driver.findElement(By.className("decorativeSubmit")).click();
		     
		     
			 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			 
		
			 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			
		
			 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			 
			 driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input")).sendKeys("mani");
			 
			 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			 
			 driver.findElement(By.partialLinkText("10044")).click();
			 
			 System.out.println(driver.getTitle());
			  
			 driver.findElement(By.linkText("Edit")).click();
			 
			 driver.findElement(By.id("updateLeadForm_companyName")).clear();
			   
			 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("laxus");
			 
			 driver.findElement(By.name("submitButton")).click();
			   
			 String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
			 System.out.println(text);
			 
			 driver.close();
		}

	

}
