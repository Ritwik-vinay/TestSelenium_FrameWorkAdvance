package org.testrv.Pages.pageFactory.appvwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    WebDriver driver;
    public login(WebDriver driver){
        this.driver= this.driver;
    }

    //Page Locators
    private  By emailid= By.id("login-username");
    private By password= By.id("login-password");
    private By submitbtn= By.xpath("//span(@data-qa= 'ezazsuguuy')");

    //Step 2- Page Actions

    public void validUserName(String username, String pwd){
        driver.findElement(emailid).sendKeys(username);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submitbtn).click();

    }
}

