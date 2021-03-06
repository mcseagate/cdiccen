package TestBase;

import PageConfiguration.PageConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;
    public static FileInputStream ip;



    public BaseClass(){

        try {
        prop = new Properties();
        ip = new FileInputStream("/Users/mgodfrey/IdeaProjects/cdiccen/src/config.properties");
        prop.load(ip);

        } catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");
        String chpath = "/Users/mgodfrey/IdeaProjects/cdiccen/src/Drivers/chromedriver 2";
        String ffpath ="/Users/mgodfrey/Documents/Drivers/geckodriver";

        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver" , chpath);
            driver = new ChromeDriver();


        } else if(browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver" , ffpath);
            driver = new FirefoxDriver();


        } else{
            System.out.println("Browser Type Not In Use");
        }

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(PageConfig.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PageConfig.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }



}
