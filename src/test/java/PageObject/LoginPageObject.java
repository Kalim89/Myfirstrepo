package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject 
{
 WebDriver Idriver;
 @FindBy(id="Email")
 @CacheLookup
private WebElement usernameText;
 @FindBy(id="Password")
 @CacheLookup
 private WebElement passWordText;
 @FindBy(xpath="//button[@type='submit']")
 @CacheLookup
 private WebElement loginBtn;
 @FindBy(xpath="//a[.='Logout']")
 @CacheLookup
 private WebElement logoutBtn;
 
 public LoginPageObject(WebDriver rdriver)
 {
	 Idriver=rdriver;
	 PageFactory.initElements(rdriver,this);
 }
 public void setUsername(String uname)
 {
	 usernameText.clear();
	 usernameText.sendKeys(uname);
 }
 public void setPassword(String pwd)
 {
	 passWordText.clear();
	 passWordText.sendKeys(pwd);
 }
 public void clickLogin()
 {
	 loginBtn.click();
 }
 public void clickLogout()
 {
	 logoutBtn.click();
 }
 
}
