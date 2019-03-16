package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleBaseClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		//get url
		driver.get("https://www.redbus.in/");
		WebElement source=driver.findElement(By.id("src"));
		source.sendKeys("Chennai");
		WebElement destination=driver.findElement(By.id("dest"));
		destination.sendKeys("Sirkazhi");

	}

}
