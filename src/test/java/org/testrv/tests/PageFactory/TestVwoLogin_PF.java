package org.testrv.tests.PageFactory;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import org.testrv.Pages.pageFactory.appvwo.login;

public class TestVwoLogin_PF {
    @Description("Verify Positive Test")
    @Test
    public void PositiveTestCase(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver= new EdgeDriver(options);
        driver.get("https://app.vwo.com/");
        login login = new login(driver);
        login.validUserName("Test","1234");

    }
}
