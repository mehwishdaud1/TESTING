package FirstSelenium.MyCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.WebElement;

public class myTestJava {
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehwish\\eclipse-workspace\\MyCourse\\.settings\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");

	//WebElement signup1=driver.findElement(By.xpath("//*[@id=\"u_0_a_LS\"]/div[3]/a"));
	//signup1.click();
	//WebElement forgetlink=driver.findElement(By.linkText("Create a Page"));
///forgetlink.click();

WebElement userEmail=driver.findElement(By.id("email"));
userEmail.sendKeys("MyNAME");
WebElement userPassword=driver.findElement(By.id("pass"));
userPassword.sendKeys("MyPassword");
WebElement Login=driver.findElement(By.name("login"));
Login.click();  
System.out.println("HEllo World");
//String output=userEmail.getAttribute("Email address or phone number");
//System.out.println(output);
	//Thread.sleep(1000);
	//driver.navigate().back();
	//Thread.sleep(1000);
	//driver.navigate().forward();
	//Thread.sleep(10000);
	//driver.navigate().refresh();
	/*
	List<WebElement> list=driver.findElements(By.tagName("a"));
	for(WebElement l:list) {
		
		System.out.println(l.getAttribute(""));
	}
	} */

}}
