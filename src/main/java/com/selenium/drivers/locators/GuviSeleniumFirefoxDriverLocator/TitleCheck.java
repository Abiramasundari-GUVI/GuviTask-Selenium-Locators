package com.selenium.drivers.locators.GuviSeleniumFirefoxDriverLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

	 public static void main(String[] args) {
	        // Step 1: Set up the ChromeDriver path (replace with your local path)
	        System.setProperty("webdriver.chrome.driver", "E:\\ne guvi java\\chrome-win64\\chromedriver.exe");

	        // Step 2: Initialize WebDriver for Chrome
	        WebDriver driver = new ChromeDriver();
	        

	        try {
	            // Step 3: Maximize the browser window
	            driver.manage().window().maximize();

	            // Step 4: Navigate to the website
	            String url = "https://www.demoblaze.com/";
	            driver.get(url);

	            // Step 5: Verify the title of the page
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
	            // Step 6: Close the browser
	            driver.quit();
	            System.out.println("Browser closed.");
	        }
	    }
}
