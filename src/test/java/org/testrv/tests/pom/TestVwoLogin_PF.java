package org.testrv.tests.pom;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testrv.Pages.pageFactory.appvwo.LoginPage;
import org.testrv.Pages.pageFactory.appvwo.dashboard;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVwoLogin_PF {
    @Description("Verify Positive Test")
    @Test
    public void PositiveTestCase() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        LoginPage loginpage = new LoginPage(driver);
        String errormessgae = loginpage.InvalidUserName("admin@gmail.com", "12345");

        //Assertion
        assertThat(errormessgae).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(errormessgae, "Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public void negativeTestCase() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.vwoValidLoginTest("ritwikvinay38@gmail.com","123TestingAutomation");

        dashboard DB = new dashboard(driver);
        String dashboardText= DB.dashboardpage();

        assertThat(dashboardText).isNotBlank().isNotEmpty().isNotBlank();
        Assert.assertEquals(dashboardText,"Welcome Ritwik Vinay \uD83D\uDC4B\uD83C\uDFFB");
        driver.quit();

    }
}
