package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")

	private WebElement allowNotif;

	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup")

	private WebElement loginButton;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.widget.EditText")

	private WebElement mailTextField;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View[3]/android.widget.EditText")

	private WebElement passwordTextField;


	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.widget.Button")

	private WebElement signInButton;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View[4]")

	private WebElement passwordError;

	//@AndroidFindBy (id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]")

	//private WebElement mailError;

	//@AndroidFindBy (id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.TextView[4]")

	//private WebElement generalInvalidError;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '1')]")
	private WebElement pin1;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '2')]")
	private WebElement pin2;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '3')]")
	private WebElement pin3;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '4')]")
	private WebElement pin4;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Please make sure')]")
	private WebElement generalInvalidError;
	@AndroidFindBy(xpath = "//android.view.View[@text='Please enter a valid e-mail or identity number.']")
	private WebElement mailError;


	//@AndroidFindBy(id = "error-1095225618937")
	//private WebElement passwordError;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Security Verification']")
	private WebElement SMSVerificationTitle;
	//@AndroidFindBy(xpath = "//android.view.View[contains(@text, 'SMS verification')]")
	//private WebElement SMSVerificationTitle;

	//@AndroidFindBy (id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.TextView")

	//private WebElement SMSVerificationTitle;




	public LoginPage(){
	}

public LoginPage enterUserName(String username) throws InterruptedException {
	clear(mailTextField);
	sendKeys(mailTextField, username, "login with " + username);
	return this;
}

public LoginPage enterPassword(String password) {
		//click(passwordTextField);
	clear(passwordTextField);
	sendKeys(passwordTextField, password, "password is " + password);
	return this;
}
	public LoginPage allowNotif() {
		try {
			// Elementin görünür olmasını bekleyin. 10 saniye içinde görünür olmasını bekliyoruz.
			new BasePage().isVisible(allowNotif);
			click(allowNotif, "press accept cookies button");
		} catch (TimeoutException e) {
			// Eğer element görünür değilse, TimeoutException yakalanır ve işlem devam eder
			System.out.println("Cookie accept button not visible. Proceeding without clicking.");
		}
		// Teste devam et
		return new LoginPage();
	}

public LoginPage pressLoginBtn() {
	click(loginButton, "press login button");
	return new LoginPage();
}


	public LoginPage enterPin() {
		click(pin1);
		click(pin2);
		click(pin3);
		click(pin4);
		return new LoginPage();
	}
	public LoginPage pressSignInButton() {
		click(signInButton, "press login button");
		return new LoginPage();
	}


public LoginPage login(String username, String password) throws InterruptedException {
	enterUserName(username);
	enterPassword(password);
	return pressLoginBtn();
}

	public String getPasswordError() {
		click(signInButton);
		String err = getText(passwordError, "error text is - ");
		return err.trim();
	}

	public String getMailError() {
		String err = getText(mailError, "error text is - ");
		return err;
	}

	public String getGeneralInvalidError() {
		String err = getText(generalInvalidError, "error text is - ");
		return err;
	}

	public String verifySMSVerification() {
		String err = getText(SMSVerificationTitle, "Login is success waiting sms verification - ");
		return err;
	}
	public void waitForPinScreen() {
		try {
			System.out.println("Waiting for PIN screen...");
			Thread.sleep(30 * 1000); // 120 saniye bekle
		} catch (InterruptedException e) {
			throw new RuntimeException("Wait was interrupted!", e);
		}
	}
}
