package day21;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 Test Case
 ---------
 1) Launch the browser
 2) Open URL https://demo.opencart.com
 3) Validate title should be "Your Store"
 4) close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Launch the browser	(chrome)
		WebDriver driver = new ChromeDriver();	
		
		// 2) Open URL https://demo.opencart.com
		//driver.get("https://demo.opencart.com");

		driver.get("https://ultimateqa.com/consulting/");
		
		
		driver.manage().window().maximize();
		
	    // 3) Validate title should be "Your Store"
		//String act_title= driver.getTitle();	
		//if(act_title.equals("Your Store")) {
		//	System.out.println("Test Pass");
		//}else {
		//	System.out.println("Test Failed ");
		//}
		
		// 4) close browser
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//classname
		//List<WebElement> headerLinks=driver.findElements(By.className("pipe"));
		//System.out.println("Total number of header links:" +headerLinks.size());
		
		//tagname
		//List<WebElement> links=driver.findElements(By.tagName("img"));
		//System.out.println("Total number of links:" +links.size());
		
		//img
//		List<WebElement> images=driver.findElements(By.tagName("img"));
//		System.out.println("Total number of links:" +images.size());
				
		//driver.findElement(by.)
		
	//	driver.close();
		
	}

}
