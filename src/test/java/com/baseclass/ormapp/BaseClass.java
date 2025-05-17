package com.baseclass.ormapp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
    // Using ThreadLocal to ensure WebDriver works safely in multi-threaded environments
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Getter method to access WebDriver
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Setter method to initialize WebDriver
    public static void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }

    @Before(order = 0)
    public void driverSetup() throws InterruptedException {
        System.out.println("Initializing WebDriver...");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        // Set WebDriver instance for the current thread
        setDriver(webDriver);
        System.out.println("WebDriver Initialized: " + getDriver());
    }

    @After(order = 0)
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // Remove the WebDriver instance from ThreadLocal
            System.out.println("WebDriver Quit Successfully.");
        }
    }
}