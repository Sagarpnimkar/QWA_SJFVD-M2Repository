package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedIncheckBox")
	private WebElement loggedIncheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoggedIncheckbox() {
		return loggedIncheckbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginIntoActitime(String username, String password){

		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loggedIncheckbox.click();
		loginButton.click();
		
	}
	
	
	public void InvalidLoginIntoActitime(String username,String password) {
		
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
		usernameTextfield.clear();
		
		
		
		
	}
		
		
		
	}
	
	
