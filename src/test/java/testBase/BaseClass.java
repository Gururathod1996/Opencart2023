package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	
   @BeforeClass
	public void setUp() throws InterruptedException
	{
	   logger=LogManager.getLogger(this.getClass()); //get the log(activity) of the current testcase
	   
		
		WebDriverManager.chromedriver().setup();
		
		
		driver=new ChromeDriver();
		
		
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost/opencart/upload/");
				
		driver.manage().window().maximize();
		  Thread.sleep(3000);
	}
	
   @AfterClass
	public void tearDown()
	{
		//driver.quit();
	}

	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);//abcde, tyuio, nhjio,
		return (generatedString);
	}

	
	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);//abcd, mnjh,
		String num = RandomStringUtils.randomNumeric(3); //123,456.678,
		
		return (st+"@"+num);   //password
	}
		

	}


