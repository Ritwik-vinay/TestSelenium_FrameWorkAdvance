package org.testrv.Pages.pageobjectModel.appvwo.improvedPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testrv.base.commontoAllpages;
import org.testrv.driver.driverManager;
import org.testrv.util.waitHelpers;

public class dashboardImproved extends commontoAllpages {

    WebDriver driver;

    public dashboardImproved(){
        this.driver= driver;
    }
    private static By dashboardtext=By.cssSelector("h2[data-qa='nequvasojo']");

    public static String dashboardTextimproved(){
        waitHelpers.checkvisibility(driverManager.getDriver(),dashboardtext);
        return getText(dashboardtext);
    }
}
