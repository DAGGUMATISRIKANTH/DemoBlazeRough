package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatecart {
	WebDriver driver;
	WebElement textbox;
	public void url() {
		System.setProperty("weddriver.chrome.driver", "D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
	}
	public void select() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    String s = driver.switchTo().alert().getText();
	    System.out.println(s);
	    alert.accept();
	    driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		String s1=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
		System.out.println(s1);
		driver.navigate().to("https://www.demoblaze.com/");
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	    
	    Alert ale = driver.switchTo().alert();
	    String s2 = driver.switchTo().alert().getText();
	    System.out.println(s2);
	    alert.accept();
	    driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		String s3=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
		System.out.println(s3);
		
	}
	public void cart() {
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		
		
	}
	
	public void price() {
		String s4= driver.findElement(By.xpath("//*[@id=\"totalp\"]")).getText();
		System.out.println(s4);
		
	}

}
