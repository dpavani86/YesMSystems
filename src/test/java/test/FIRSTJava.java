package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIRSTJava {

	

		@Test
		public void negativelogin() {

			// TODO Auto-generated method stub
           WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://magento.com");
			driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
			driver.findElement(By.name("login[username]")).clear();
			driver.findElement(By.name("login[username]")).sendKeys("dpavani86@gmail.com");
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys("kulkun");
			driver.findElement(By.id("send2")).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"),"Invalid login or password." ));
			
			driver.quit();

	
		}
	

	}
	
	
	
	
	
	
