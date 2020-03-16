package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Invalidcontactdetails {
	WebDriver driver;
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void clickcontact()
	{
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
	}
	public void details()
	{
		driver.findElement(By.id("recipient-email")).sendKeys("");
		driver.findElement(By.id("recipient-name")).sendKeys("");
		driver.findElement(By.id("message-text")).sendKeys("");
}
	public void send()
	{
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	}

}


