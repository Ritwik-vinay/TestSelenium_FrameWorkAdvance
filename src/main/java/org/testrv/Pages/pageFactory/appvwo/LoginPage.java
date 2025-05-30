package org.testrv.Pages.pageFactory.appvwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testrv.util.waitHelpers;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver =driver;
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
        waitHelpers.waitImplicitWait(driver, 3);

        String errormessageText = driver.findElement(errormsg).getText();

        return errormessageText;

    }
}

