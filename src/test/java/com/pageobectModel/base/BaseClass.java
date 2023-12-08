package com.pageobectModel.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BaseClass {
    Properties prop;
    WebDriver driver;
    public void initialization() throws IOException {

        //Properties class
        // prop=new Properties();
       // FileInputStream file=new FileInputStream("C:\\Users\\nagaveni.hk\\IdeaProjects\\OrangeHrmProject\\resource\\application.properties");
        //prop.load(file);
        // String BrowserDriver= prop.getProperty("browser");
        System.setProperty("webdriver.driver.chrome","C:\\Users\\nagaveni.hk\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
       // driver.get(prop.getProperty("baseurl"));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
}
