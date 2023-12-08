package com.pageobectModel.test;

import com.pageobectModel.base.BaseClass;
import com.pageobectModel.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;


public class TestClass extends BaseClass {

    WebDriver driver;
    @BeforeMethod
    public void setup() throws IOException {
        initialization();

    }
    @Test
    public void loginTest() throws IOException {


        LoginPage loginPage = new LoginPage(driver);
        // Properties prop=new Properties();
        // FileInputStream file=new FileInputStream("C:\\Users\\nagaveni.hk\\IdeaProjects\\OrangeHrmProject\\resource\\application.properties");
        // prop.load(file);
        // String pwd=prop.getProperty("username");
        //  String user=prop.getProperty("password");
        loginPage.login("Admin", "admin123");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
