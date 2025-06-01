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
import org.testrv.util.PropertiesReader;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVwoLogin_PF_Properties_DriverManager extends CommonToAllTests {
    @Description("Verify Positive Test")
    @Test
    public void InvalidLoginTestCase() throws InterruptedException {


        // Driver Manager Code - 1
        driverManager.init();

        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(driverManager.getDriver());
        String error_msg = loginPage.InvalidUserName(PropertiesReader.readKeys("invalid_username"),PropertiesReader.readKeys("invalid_password"));

        // Assertions - 3
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKeys("error_message"));

        driverManager.getDriver().quit();
    }

    @Test
    public void validLoginTestCase() throws InterruptedException {

        LoginPage loginPage_VWO = new LoginPage(driverManager.getDriver());
        loginPage_VWO.vwoValidLoginTest(PropertiesReader.readKeys("username"),PropertiesReader.readKeys("password"));

        dashboard db  = new dashboard(driverManager.getDriver());
        String usernameLoggedIn = db.dashboardpage();


        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();


    }
}
