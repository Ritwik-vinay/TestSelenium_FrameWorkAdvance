package org.testrv.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testrv.util.PropertiesReader;

import static org.testrv.driver.driverManager.getDriver;

public class commontoAllpages {
    public commontoAllpages() {
    }

    public void openvwoURL() {
        getDriver().get(PropertiesReader.readKeys("url"));
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

    public static String getText(By by) {
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement by) {
        return by.getText();
    }

}
