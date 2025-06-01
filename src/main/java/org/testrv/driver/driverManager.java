package org.testrv.driver;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testrv.util.PropertiesReader;

import java.util.Properties;

public class driverManager {
    public static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        driverManager.driver = driver;
    }

    public static void init(){
        //Start which browser to initiate
        String browser= PropertiesReader.readKeys("browser");
        browser= browser.toLowerCase();
        switch (browser){
            case "edge" :
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--guest");
                driver= new EdgeDriver(edgeOptions);
                break;
            case "chrome" :
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                driver= new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                driver= new FirefoxDriver(firefoxOptions);
                break;
            default:
                System.out.println("No other Browser Supported");
        }

    }
    public static void down(){
        if (getDriver() != null) {
            driver.quit();
            driver = null;
        }
    }
}
