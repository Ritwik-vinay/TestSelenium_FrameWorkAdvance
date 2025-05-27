package org.testrv.Pages.pageFactory.appvwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    WebDriver driver;
    login(WebDriver driver){
        this.driver= driver;
    }

    //Page Locators
    private  By emailid= By.id("login-username");
    private By password= By.id("login-password");

    //Step 2- Page Actions

}
