package com.pre;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewSeli {

	public static void main(String[] args) throws InterruptedException{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahads\\eclipse-workspace\\cucumber\\com.pre\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
        
        driver.findElement(By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']")).getText();
        System.out.println();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jak");
        driver.findElement(By.xpath("//input[@name='lastname'] ")).sendKeys("ahad");
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("shsoel@");
        //Selec
        Select aa =new Select (driver.findElement(By.name("birthday_month")));
        aa.selectByIndex(4);
        Select bb =new Select (driver.findElement(By.name("birthday_day")));
        bb.selectByValue("11");
        Select cc =new Select (driver.findElement(By.name("birthday_year")));
        cc.selectByVisibleText("1945");
        
        //Radio button
        
        driver.findElement(By.xpath("//*[@id='u_0_a']")).click();
        
        // Using breaking Xpath concept  when you know how many link Facebook. I print the name of all link'
        // I breake the xpath String hh = "//*[@id='js_0']/ul/li[";
        // I breake the Xpath 2nd String gg= "]/a";
        String hh = "//*[@id='js_0']/ul/li[";
      
        String gg= "]/a";
        
        for (int i=1;i<10;i++){
        	String jj= hh+i+gg;
        	System.out.println(driver.findElement(By.xpath(jj)).getText());
        }
        
        
        
        
        
        
        
       // driver.close(); 
			}

}