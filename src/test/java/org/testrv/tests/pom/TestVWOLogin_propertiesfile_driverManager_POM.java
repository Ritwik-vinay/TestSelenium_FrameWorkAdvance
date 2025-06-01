package org.testrv.tests.pom;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testrv.Pages.pageobjectModel.appvwo.improvedPOM.LoginPageImproved;
import org.testrv.Pages.pageobjectModel.appvwo.improvedPOM.dashboardImproved;
import org.testrv.base.CommonToAllTests;
import org.testrv.driver.driverManager;
import org.testrv.util.PropertiesReader;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_propertiesfile_driverManager_POM extends CommonToAllTests {
    @Description("Verify Negative Test")
    @Test
    public void InvalidLoginTestCase() throws InterruptedException {
        LoginPageImproved loginPage = new LoginPageImproved(driverManager.getDriver());
        String error_msg = loginPage.InvalidUserName(PropertiesReader.readKeys("invalid_username"), PropertiesReader.readKeys("invalid_password"));

        // Assertions - 3
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKeys("error_message"));


    }
    @Description("Verify Positive Test")
    @Test
    public void validLoginTestCase() {
        LoginPageImproved loginpage = new LoginPageImproved(driverManager.getDriver());
        loginpage.vwoValidLoginTest(PropertiesReader.readKeys("username"), PropertiesReader.readKeys("password"));
        dashboardImproved dashboard = new dashboardImproved();
        String usernameLogin= dashboard.dashboardTextimproved();
        assertThat(usernameLogin).isNotBlank().isNotEmpty().isNotNull();
        //Assert.assertEquals(usernameLogin,PropertiesReader.readKeys("expected_username"));
    }
}
