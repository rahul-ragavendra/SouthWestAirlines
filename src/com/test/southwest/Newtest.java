package com.test.southwest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.test.southwest.Driver;

public class Newtest extends Driver {
		public Newtest() throws IOException 
		{
			super();
		}
		@BeforeMethod
		public void prerequisites() throws IOException 
		{
			driver.get(getData("site"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Click here")).click();
		}
		@Test
		public void a() throws InterruptedException, IOException
		{
			driver.findElement(getPageElement("homepage", "one-way")).click();
			Thread.sleep(500);
			driver.findElement(getPageElement("homepage", "departure")).sendKeys(getData("depart"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "arrival")).sendKeys(getData("arrive"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "calender")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "date")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "noofpeople")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "incrementpeople")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "incrementpeople")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("homepage", "submit")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("selectfligth", "bussinessselector")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("selectfligth", "continue")).click();
			Thread.sleep(1000);
			WebElement element1 = driver.findElement(getPageElement("price", "verifyplaces"));
			String elementval1 = element1.getText();
			System.out.println(elementval1);
			Thread.sleep(1000);
			String elementval="Seattle/Tacoma, WA to Dallas (Love Field), TX";
			if(elementval1.equalsIgnoreCase(elementval))
			{
				System.out.println("Place is same");
			}
			else
				System.out.println("Place is not same");
			Thread.sleep(1000);
			driver.findElement(getPageElement("price", "continue")).click();
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "firstname0")).sendKeys(getData("firstname0"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "lastname0")).sendKeys(getData("lastname0"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobmonth0")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobmonth0"))).selectByIndex(2);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobday0")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobday0"))).selectByIndex(1);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobyr0")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobyr0"))).selectByIndex(22);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "gender0")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "gender0"))).selectByIndex(1);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "firstname1")).sendKeys(getData("firstname1"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "lastname1")).sendKeys(getData("lastname1"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobmonth1")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobmonth1"))).selectByIndex(1);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobday1")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobday1"))).selectByIndex(21);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobyr1")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobyr1"))).selectByIndex(26);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "gender1")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "gender1"))).selectByIndex(1);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "firstname2")).sendKeys(getData("firstname2"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "lastname2")).sendKeys(getData("lastname2"));
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobmonth2")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobmonth2"))).selectByIndex(4);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobday2")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobday2"))).selectByIndex(17);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "dobyr2")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "dobyr2"))).selectByIndex(24);
			Thread.sleep(1000);
			driver.findElement(getPageElement("bookreservations", "gender2")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(getPageElement("bookreservations", "gender2"))).selectByIndex(1);
			Thread.sleep(1000);
			WebElement element2 = driver.findElement(getPageElement("bookreservations", "purchase"));
			String elementval2 = element2.getAttribute("value");
			System.out.println(elementval2);
			if(elementval2.equalsIgnoreCase("Purchase"))
				System.out.println("Purchase button is available");
			else
				System.out.println("Purchase button is not available");
			driver.close();
		}
	
		
		@AfterClass
		public void close()
		{
			driver.quit();
		}
	}

	


