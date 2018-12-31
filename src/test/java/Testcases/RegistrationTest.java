package Testcases;

import PageElements.PageRegistrationElements;
import TestBase.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {
    PageRegistrationElements PRE;
    ExtentReports report;
    ExtentTest test;

    public RegistrationTest(){

        super();
    }


    @BeforeMethod
    public void setUp(){
        initialization();
        PRE = new PageRegistrationElements();
        report = new ExtentReports("/Users/mgodfrey/IdeaProjects/cdiccen/src/main/java/TestReports.html");
        test = report.startTest("User Registration");

    }


    @Test
    public void userRegistration(){

        PRE.registration();
        test.log(LogStatus.INFO, "Registration Completed Successfully");
    }

    @Test
    public void verifyTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Welcome: Mercury Tours", title);
        test.log(LogStatus.INFO, "Title is correct");
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
        test.log(LogStatus.INFO, "Test Ended Successfully");
        report.endTest(test);
        report.flush();

    }


}
