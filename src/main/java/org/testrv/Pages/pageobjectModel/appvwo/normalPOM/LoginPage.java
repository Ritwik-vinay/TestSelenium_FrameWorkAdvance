package org.testrv.Pages.pageobjectModel.appvwo.normalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testrv.util.waitHelpers;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    private By emailid = By.id("login-username");
    private By password = By.id("login-password");
    private By submitbtn = By.id("js-login-btn");
    private By errormsg = By.id("js-notification-box-msg");

    //Step 2- Page Actions

    public String InvalidUserName(String username, String pwd) throws InterruptedException {
        driver.get("https://app.vwo.com/");
        driver.findElement(emailid).sendKeys(username);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submitbtn).click();
        waitHelpers.checkvisibility(driver, errormsg);

        String errormessageText = driver.findElement(errormsg).getText();


        return errormessageText;

    }

    public void vwoValidLoginTest(String username, String pwd) {
        driver.get("https://app.vwo.com/");
        driver.findElement(emailid).sendKeys(username);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submitbtn).click();
        waitHelpers.JVMwait(5000);

    }
}

