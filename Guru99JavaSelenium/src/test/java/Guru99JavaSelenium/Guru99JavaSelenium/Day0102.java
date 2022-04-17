package Guru99JavaSelenium.Guru99JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day0102 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.name("uid"));
		WebElement passWd = driver.findElement(By.name("password"));
		WebElement submitBtn = driver.findElement(By.name("btnLogin"));

		userName.sendKeys("mngr399858");
		passWd.sendKeys("pezAtub");
		submitBtn.click();
		String ActualTitle = driver.getTitle();

		if (ActualTitle.equalsIgnoreCase("Guru99 Bank Manager HomePage"))
			System.out.println("Test Passed ....");

		else

			System.out.println("Test Failed ....");

		driver.quit();
	}

}
