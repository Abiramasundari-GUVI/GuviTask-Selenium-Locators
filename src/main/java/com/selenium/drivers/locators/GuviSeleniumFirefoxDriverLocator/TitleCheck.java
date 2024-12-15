package com.selenium.drivers.locators.GuviSeleniumFirefoxDriverLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleCheck {

	 public static void main(String[] args) {
	        // Set the path to GeckoDriver (Replace with the correct path to geckodriver)
	        System.setProperty("webdriver.gecko.driver", "E:\\ne guvi java\\firefor drivers\\geckodriver.exe");

	        // Step 1: Initialize WebDriver for Firefox
	        WebDriver driver = new FirefoxDriver();

	        try {
	            // Step 2: Maximize the browser window
	            driver.manage().window().maximize();

	            // Step 3: Navigate to the website
	            String url = "https://www.demoblaze.com/";
	            driver.get(url);

	            // Step 4: Get and verify the title of the page
	            String expectedTitle = "STORE";
	            String actualTitle = driver.getTitle();

	            if (actualTitle.equals(expectedTitle)) {
	                System.out.println("Page landed on correct website");
	            } else {
	                System.out.println("Page not landed on correct website");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Step 5: Close the browser
	            driver.quit();
	            System.out.println("Browser closed.");
	        }
	    }
}
