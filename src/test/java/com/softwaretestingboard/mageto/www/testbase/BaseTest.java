package com.softwaretestingboard.mageto.www.testbase;


import com.softwaretestingboard.mageto.www.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";
@BeforeMethod
    public void setUp(){
    selectBrowser(browser);
    }
@AfterMethod
    public void tearDown(){
closeBrowser();
    }
}
