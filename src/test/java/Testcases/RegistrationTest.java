package Testcases;

import PageElements.PageRegistrationElements;
import TestBase.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {
    PageRegistrationElements PRE;

    public RegistrationTest(){
        super();
    }


    @BeforeMethod
    public void setUp(){
      initialization();
      PRE = new PageRegistrationElements();
    }


    @Test
    public void userRegistration(){
        PRE.registration();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
