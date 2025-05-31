package org.testrv.Pages.pageFactory.appvwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testrv.util.waitHelpers;

public class dashboard {
    WebDriver driver;

    public dashboard() {
        this.driver = driver;
    }

    private By dashboard_txt = By.cssSelector("h2[data-qa='nequvasojo']");

    public String dashboardpage() {
        waitHelpers.checkvisibility(driver, dashboard_txt);
//        waitHelpers.JVMwait(10000);
        return driver.findElement(dashboard_txt).getText();


    }
}
