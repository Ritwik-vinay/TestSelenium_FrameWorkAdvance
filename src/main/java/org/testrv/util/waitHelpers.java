package org.testrv.util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitHelpers {
    private WebDriver driver;
    private WebDriverWait wait;

    public waitHelpers(WebDriver driver, int timeoutInSeconds) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean waitForElementToBeInvisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public boolean waitForUrlToContain(String partialUrl) {
        return wait.until(ExpectedConditions.urlContains(partialUrl));
    }

    public boolean waitForTitleToBe(String expectedTitle) {
        return wait.until(ExpectedConditions.titleIs(expectedTitle));
    }

    public boolean waitForElementTextToBe(By locator, String expectedText) {
        return wait.until(ExpectedConditions.textToBe(locator, expectedText));
    }

    public Alert waitForAlertToBePresent() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public boolean waitForElementToBeSelected(By locator) {
        return wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public WebElement waitForPresenceOfElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public boolean waitForJavaScriptToLoadCompletely() {
        return wait.until(driver -> ((JavascriptExecutor) driver)
                .executeScript("return document.readyState").equals("complete"));
    }
}
