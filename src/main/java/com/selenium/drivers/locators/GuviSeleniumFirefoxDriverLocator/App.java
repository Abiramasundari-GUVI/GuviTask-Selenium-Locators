package com.selenium.drivers.locators.GuviSeleniumFirefoxDriverLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
	public static void main(String[] args) {
        // Set the path to GeckoDriver (downloaded driver for Firefox)
        System.setProperty("webdriver.gecko.driver", "E:\\ne guvi java\\firefor drivers\\geckodriver.exe"); // Replace with the actual path

        // Step 1: Initialize WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        try {
            // Step 2: Maximize the browser window
            driver.manage().window().maximize();

            // Step 3: Navigate to the given URL
            String url = "http://google.com";
            driver.get(url);

            // Step 4: Print the current page URL
            System.out.println("Current Page URL: " + driver.getCurrentUrl());

            // Step 5: Reload (refresh) the page
            driver.navigate().refresh();
            System.out.println("Page has been refreshed!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
