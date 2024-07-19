package util_pack;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait_Class extends BaseClass
{
 public static WebDriverWait wait;
	public static WebElement visibilityOf(WebElement wb)
	{
		 wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 return wait.until(ExpectedConditions.visibilityOf(wb));
	}
	public void sendKeys(WebElement wb ,String value)
	{
		Wait_Class.visibilityOf(wb).sendKeys(value);
	}
	
	public void click (WebElement wb )
	{
		Wait_Class.visibilityOf(wb).click();
	}
}
