package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class SwapPage extends BasePage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(accessibility = "BTC Al")
	private WebElement swapButton;

	@AndroidFindBy(accessibility = "USDC / TRYB, USD Coin, 35, ,2000, TRYB, %0.2")
	private WebElement usdcTrybButton;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='USDT']")
	private WebElement usdtButton;

	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='market_list_item_'])[2]")
	private WebElement btcUSDT;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='1 BTC ≈ 103.257 USDT']/android.view.ViewGroup/android.widget.TextView")
	private WebElement currentBTC;

	@AndroidFindBy(accessibility = "BTC Al")
	private WebElement btcAlButton;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
	private WebElement numberButton1;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[16]/android.widget.TextView")
	private WebElement numberButton0;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Al/Sat']")
	private WebElement alSatTextView;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement valueText;
	public SwapPage(){
	}

	public SwapPage pressSwapButton() {
		click(swapButton, "press al/sat button");
		waitForElement(swapButton);
		return new SwapPage();
	}

	public SwapPage selectUSDT() {
		click(usdcTrybButton);
		click(usdtButton, "press USDT button");
		click(btcUSDT);
		return new SwapPage();
	}

	public void checkBtcToUsdtValue() {
		// Elementin metnini al
		String btcUsdtValue = currentBTC.getText();

		// Ekrana yazdır
		System.out.println("Current BTC to USDT value: " + btcUsdtValue);

		// Değeri kontrol et
		if (btcUsdtValue != null && !btcUsdtValue.isEmpty()) {
			System.out.println("BTC/USDT value is: " + btcUsdtValue);
		} else {
			System.out.println("BTC/USDT value not found or is empty");
		}
	}
	public void enter100UsdAndBuy() {

		click(numberButton1, "Press number 1");
		click(numberButton0, "Press number 0");
		click(numberButton0, "Press number 0");


		click(btcAlButton, "Click on BTC Al button");
	}
	public void checkIfValueIs100() {
		String value = valueText.getText();  // TextView öğesinin metnini alıyoruz
		if ("100".equals(value)) {
			System.out.println("The value is correct: " + value);  // 100 ise doğru
		} else {
			System.out.println("The value is incorrect: " + value);  // Farklı bir değerse hata mesajı veriyoruz
		}
	}
}
