package com.qa.stepdef;

import com.qa.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @When("I accept cookies")
    public void allowNotification()  {
        new LoginPage().allowNotif();
    }

    @When("I press login button")
    public void iLogin() {
        new LoginPage().pressLoginBtn();
    }


    @When("I enter username as {string}")
    public void iEnterUsernameAs(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);
    }

    @When("I enter password as {string}")
    public void iEnterPasswordAs(String password) {
        new LoginPage().enterPassword(password);
    }

    @When("I press sign in button")
    public void iPressSignInButton() {
        new LoginPage().pressSignInButton();
    }

    @Then("I Enter Pin")
    public void iEnterPin() {
        new LoginPage().enterPin();
    }

    @Then("login should fail with an invalid password error {string}")
    public void loginShouldFailWithAnPasswordError(String err) {
        String actualError = new LoginPage().getPasswordError();
        Assert.assertTrue("Error message mismatch!", actualError.contains(err));
    }

    @Then("login should fail with an invalid mail error {string}")
    public void loginShouldFailWithAMailError(String err) {
        Assert.assertEquals(new LoginPage().getMailError(), err);
    }
    @Then("login should fail with an error {string}")
    public void loginShouldFailWithAPasswordError(String err) {
        Assert.assertEquals(new LoginPage().getGeneralInvalidError(), err);
    }

    @Then("login should success and see sms verification {string}")
    public void iShouldSeeSMSVerificationTitle(String title) {
        Assert.assertEquals(new LoginPage().verifySMSVerification(), title);
    }
    @Then("I wait for the PIN screen")
    public void iWaitForPinScreen() {
            new LoginPage().waitForPinScreen();
            System.out.println("PIN screen waiting completed.");
    }
}
