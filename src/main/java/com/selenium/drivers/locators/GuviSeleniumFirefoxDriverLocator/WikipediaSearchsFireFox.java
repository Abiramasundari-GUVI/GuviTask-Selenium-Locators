package com.selenium.drivers.locators.GuviSeleniumFirefoxDriverLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearchsFireFox {

    public static void main(String[] args) {
        // Step 1: Set up ChromeDriver path (replace with your local path)
        System.setProperty("webdriver.chrome.driver", "E:\\ne guvi java\\chrome-win64\\chromedriver.exe");

        // Step 2: Initialize Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step 3: Maximize the browser window
            driver.manage().window().maximize();

            // Step 4: Navigate to Wikipedia homepage
            driver.get("https://www.wikipedia.org/");

            // Step 5: Locate the search input box, enter "Artificial Intelligence", and search
            WebElement searchBox = driver.findElement(By.id("searchInput"));
            searchBox.sendKeys("Artificial Intelligence");

            // Locate the search button and click it
            WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
            searchButton.click();

            // Step 6: Click on the "History" section in the resulting page
            WebElement historySection = driver.findElement(By.id("History"));
            historySection.click();

            // Step 7: Print the title of the section
            String sectionTitle = historySection.getText();
            System.out.println("The title of the section is: " + sectionTitle);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 8: Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
