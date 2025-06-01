package org.testrv.Pages.pageobjectModel.appvwo.improvedPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testrv.base.commontoAllpages;
import org.testrv.driver.driverManager;
import org.testrv.util.waitHelpers;

public class LoginPageImproved extends commontoAllpages {
    WebDriver driver;

    public LoginPageImproved(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    private By emailid = By.id("login-username");
    private By password = By.id("login-password");
    private By submitbtn = By.id("js-login-btn");
    private By errormsg = By.id("js-notification-box-msg");

    //Step 2- Page Actions

    public String InvalidUserName(String username, String pwd) {
        openvwoURL();
        enterInput(emailid, username);
        enterInput(password, pwd);
        clickElement(submitbtn);
        waitHelpers.checkvisibility(driverManager.getDriver(), errormsg);
        return getText(errormsg);


    }

    public void vwoValidLoginTest(String username, String pwd) {
        openvwoURL();
        enterInput(emailid, username);
        enterInput(password, pwd);
        clickElement(submitbtn);

    }
}

