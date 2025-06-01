package org.testrv.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testrv.driver.driverManager;

public class CommonToAllTests {
    @BeforeMethod
    public void setUp(){
        driverManager.init();
    }

    @AfterMethod
    public void tearDown(){
        driverManager.down();
    }
}
