package com.BriteERP.pages;

import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver= Driver.getDriver();
    String usernameLocator = "//input[@id='login']";
    String passwordLocator = "//input[@id='password']";
    String loginButtonLocator = "//button[@class='btn btn-primary']";


    public void login(String username, String password){
        SeleniumUtils.waitPlease(2);
        driver.findElement(By.xpath(usernameLocator)).sendKeys(username);
        SeleniumUtils.waitPlease(2);
        driver.findElement(By.xpath(passwordLocator)).sendKeys(password);
        SeleniumUtils.waitPlease(2);
        driver.findElement(By.xpath(loginButtonLocator)).click();
        SeleniumUtils.waitPlease(2);

    }


}
