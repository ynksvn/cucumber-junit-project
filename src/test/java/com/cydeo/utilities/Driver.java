package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

//Creating a private constructor, we are closing access to the object of this class from outside the class
    private Driver(){ }

    //We make WebDriver private, because we want to close the access from outside of the class. Ww will create get driver method to enable the access just to reading it
//We make it static because we will use it in a static method and runs first

//    private static WebDriver driver; //value is null by default - we use at Singleton design

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
//it will check if driver is null and if it is w will set up browser  inside if statement
        //if you already setup driver and using it again for following line of codes, it will return to same driver
        if (driverPool.get() == null){

            //We read browserType from configuration.properties with help of ConfigurationReader class' getDriver() method
            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set( new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set( new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }

        return driverPool.get();
    }


    public static void closeDriver(){
        if (driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();

        }

    }


}
