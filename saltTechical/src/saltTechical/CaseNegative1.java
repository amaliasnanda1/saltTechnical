package saltTechical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.Select;

public class CaseNegative1 {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		SafariOptions options = new SafariOptions();
		
		driver.manage().window().maximize();
		driver.get("https://staging.belajardaricinta.id/contact-us");
		Thread.sleep(700);
		driver.findElement(By.id("user_name")).sendKeys("nanda.oke");
		Thread.sleep(700);
		driver.findElement(By.id("email")).sendKeys("amaliasnanda1@gmail.com");
		Thread.sleep(700);
		driver.findElement(By.id("subject")).sendKeys("Matematika");
		Thread.sleep(700);
		driver.findElement(By.id("phone")).sendKeys("08170992798");
		Thread.sleep(700);
		
		WebElement el= driver.findElement(By.name("knowing_from"));
		Select select = new Select(el);
		select.selectByIndex(0);
		
		driver.findElement(By.id("knowing_from")).sendKeys("Events");
		Thread.sleep(700);
		driver.findElement(By.id("message")).sendKeys("percobaan negative tidak mengisi chapta");
		Thread.sleep(700);
	
		driver.findElement(By.id("message")).submit();
		Thread.sleep(700);
		
		driver.close();
		
	}

}
