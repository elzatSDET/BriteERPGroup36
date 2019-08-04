package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.SeleniumUtils;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTotalNumber extends TestBase {
    WebDriver driver = Driver.getDriver();

    @Test
    public void test2() {
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.getProperty("eventscrmmanager");
        String password = ConfigurationReader.getProperty("eventscrmmanagerpassword");
        loginPage.login(username, password);

        CRMPage crmPage = new CRMPage();
        crmPage.CRMpageClick();
        SeleniumUtils.waitPlease(2);
        crmPage.CRMRevenueCompare();

        int sum = 0;

        for (int i = 3; i <= 6; i++) {
            WebElement element = driver.findElement(By.xpath("//table[1]/tbody/tr[" + i + "]/td[2]"));
            int revenue =  Integer.parseInt(element.getText().replaceAll("[^\\d]",""));
//
           sum +=revenue;
        }
            System.out.println("sum: "+sum);

                WebElement total = driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td[2]"));
              int totalNumber =   Integer.parseInt(total.getText().replaceAll("[^\\d]",""));

        Assert.assertEquals(totalNumber, sum);
        }
    }

