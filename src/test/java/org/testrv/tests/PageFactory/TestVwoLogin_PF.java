package org.testrv.tests.PageFactory;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testrv.Pages.pageFactory.appvwo.login;

public class TestVwoLogin_PF {
    @Description("Verify Positive Test")
    @Test
    public void PositiveTestCase(){
        login login = new login();
        login.validUserName();
    }
}
