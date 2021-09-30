package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utility.Base;
import data.Xls_Reader;

public class LoginPage extends Base{
	 Xls_Reader reader = new Xls_Reader("C:\\eclipse\\CompleteSeleniumProject\\src\\main\\java\\data\\userdetails.xlsx");
			 
	@FindBy(xpath="//input[@placeholder='sophialee@example.com']")
	WebElement EmailId;
	
	@FindBy(xpath="//button[text()=' LOGIN ']")
	WebElement Login;
	
	public void CorrectLoginCreditioanal() {
		EmailId.sendKeys(reader.getCellData("UserDeatails", 2, 2));
		Login.click();
		
	}
	
	public void IncorrectLoginCreditioanal() {
		EmailId.sendKeys(reader.getCellData("UserDeatails", 1, 2));
		Login.click();
		
	}
	
//	public void IncorrectUsername() {
//		
//	}
//	public void IncorrectPassword() {
//	
//	}

}
