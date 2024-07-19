package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import util_pack.Wait_Class;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userEnterValidCradentials(String Username,String password)
	{
		email.sendKeys(Username);
		pass.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		 loginButton.click();
	}
	
	

}

