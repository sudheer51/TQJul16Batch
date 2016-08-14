package org.retailmenot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		//this is a keyword used in non-static context
		this.driver = driver;
	}

	By copounsLocator = By.linkText("Coupons");
    By productDealsLocator = By.linkText("Product Deals");
    
	public ProductDealsPage browseCoupons()
	{
		driver.findElement(copounsLocator).click();
		driver.findElement(productDealsLocator).click();
		return new ProductDealsPage(driver);
	}
}
