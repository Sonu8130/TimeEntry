package Contata.TimeEntry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeEntry {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://192.168.2.26:8080/TimeEntry/login.jsp;jsessionid=31BCAC1EC24CB02D38BB81E63F418103");
		driver.manage().window().maximize();

		driver.findElement(By.id("userName")).sendKeys("sonu895");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sonu895");
		String captcha = driver.findElement(By.id("CaptchaDiv")).getText();
		driver.findElement(By.id("CaptchaInput")).sendKeys(captcha);
		driver.findElement(By.id("btnGo")).click();

	}

}
