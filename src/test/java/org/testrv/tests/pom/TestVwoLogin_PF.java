package org.testrv.tests.pom;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testrv.Pages.pageobjectModel.appvwo.normalPOM.LoginPage;
import org.testrv.Pages.pageobjectModel.appvwo.normalPOM.dashboard;
import org.testrv.base.CommonToAllTests;
import org.testrv.driver.driverManager;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVwoLogin_PF extends CommonToAllTests {
    @Description("Verify Positive Test")
    @Test
    public void InvalidLoginTestCase() throws InterruptedException {


        LoginPage loginpage = new LoginPage(driverManager.getDriver());
        String errormessgae = loginpage.InvalidUserName("admin@gmail.com", "12345");

        //Assertion
        assertThat(errormessgae).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(errormessgae, "Your email, password, IP address or location did not match");
        driverManager.getDriver().quit();
    }

    @Test
    public void validLoginTestCase() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.vwoValidLoginTest("ritwikvinay38@gmail.com","123TestingAutomation");

        dashboard DB = new dashboard(driverManager.getDriver());
        String dashboardText= DB.dashboardpage();

        assertThat(dashboardText).isNotBlank().isNotEmpty().isNotBlank();
        Assert.assertEquals(dashboardText,"Welcome Ritwik Vinay \uD83D\uDC4B\uD83C\uDFFB");
        driver.quit();

    }
}
