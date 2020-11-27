package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Up {

	@Test
	public void upload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\Chrome_driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);

		for (int i = 0; i < 1000; i++) {
			String url = "http://127.0.0.1:5500/tus.html";
			String path = "D:\\Data Test\\Download Korea\\vid.mp4";
			
			driver.get(url);

			WebElement uploadFile = driver.findElement(By.id("dikaajg"));
			WebElement buttonUpload = driver.findElement(By.xpath("//button[contains(text(),'UPLOAD')]"));
			
			System.out.println("Visit Url: " + driver.getCurrentUrl());
			uploadFile.sendKeys(path);
			System.out.println("Send Path Of File: " + path);

			buttonUpload.click();
			System.out.println("Button Upload Clicked");
			System.out.println("Uplaud Success");
			driver.manage().deleteAllCookies();
		}
	}

}
