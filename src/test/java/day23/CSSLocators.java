package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	//tag id
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");
	//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Laptop");
	
	//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
	
	//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
	
	//driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("T Shirt");
	
	//driver.findElement(By.xpath("//a[text()='Computers ']")).click();
	
	driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("T shirt");
	
	//driver.close();
	
	}

}
