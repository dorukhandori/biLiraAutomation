package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.SwapPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SwapStepDef {

    @When("Proceed to Swap Page And Verify")
    public void pressSwapButton()  {

        new SwapPage().pressSwapButton();
    }

    @When("Select USDT Section")
    public void selectUSDT()  {
        new SwapPage().selectUSDT();
    }

    @When("Verify Current BTC Value Against to USD")
    public void CheckBTCValue()  {
        new SwapPage().checkBtcToUsdtValue();
    }

    @When("Enter 100usd Value and Press Buy")
    public void enter100UsdAndBuy()  {
        new SwapPage().enter100UsdAndBuy();
    }

    @When("Check Value is 100 as expected")
    public void checkValue()  {
        new SwapPage().enter100UsdAndBuy();
    }


}
