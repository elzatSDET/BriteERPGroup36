package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.SeleniumUtils;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class TestIfRevenuesAreSame extends TestBase {
    WebDriver driver = Driver.getDriver();

    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.getProperty("eventscrmmanager");
        String password = ConfigurationReader.getProperty("eventscrmmanagerpassword");
        loginPage.login(username,password);

        CRMPage crmPage = new CRMPage();
        crmPage.CRMpageClick();
        SeleniumUtils.waitPlease(2);
        crmPage.CRMRevenueCompare();


    }
    }

