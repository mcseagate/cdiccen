package PageElements;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRegistrationElements extends BaseClass {

    public PageRegistrationElements(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a")
    WebElement registrationlink;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input")
    WebElement firstname;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input")
    WebElement lastname;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > input")
    WebElement phone;

    @FindBy(css="#userName")
    WebElement email;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input")
    WebElement address;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > input")
    WebElement city;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(10) > td:nth-child(2) > input")
    WebElement state;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(11) > td:nth-child(2) > input")
    WebElement postalcode;

    @FindBy(css="#email")
    WebElement username;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(15) > td:nth-child(2) > input[type=\"password\"]")
    WebElement password;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(16) > td:nth-child(2) > input[type=\"password\"]")
    WebElement confirmpassword;

    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(18) > td > input[type=\"image\"]")
    WebElement submit;



    public void registrationlink(){
        registrationlink.click();
    }

    public void firstname(){
        firstname.sendKeys(prop.getProperty("firstname"));
    }

    public void lastname(){
        lastname.sendKeys(prop.getProperty("lastname"));
    }

    public void phone(){
        phone.sendKeys(prop.getProperty("phone"));
    }

    public void email(){
        email.sendKeys(prop.getProperty("email"));
    }

    public void address(){
        address.sendKeys(prop.getProperty("address"));
    }

    public void city(){
        city.sendKeys(prop.getProperty("city"));
    }

    public void state(){
        state.sendKeys(prop.getProperty("state"));
    }

    public void postalcode(){
        postalcode.sendKeys(prop.getProperty("postalcode"));
    }

    public void username(){
        username.sendKeys(prop.getProperty("username"));
    }

    public void password(){
        password.sendKeys(prop.getProperty("password"));
    }

    public void confirmpassword(){
        confirmpassword.sendKeys(prop.getProperty("confirmpassword"));
    }

    public void submit(){
        submit.click();
    }



    public void registration(){
        registrationlink();
        firstname();
        lastname();
        phone();
        email();
        address();
        city();
        state();
        postalcode();
        username();
        password();
        confirmpassword();
        submit();
    }


}
