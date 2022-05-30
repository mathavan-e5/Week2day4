package Week2Day2;


	import org.openqa.selenium.By;
	
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class RadioHTML {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/radio.html");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("(//input[@id='yes'])[1]")).click();
			
			
			System.out.println(driver.findElement(By.xpath("//input[contains(@value,'1') and contains(@name,'news')]")).isSelected());
			
		

	}
	
	

}
