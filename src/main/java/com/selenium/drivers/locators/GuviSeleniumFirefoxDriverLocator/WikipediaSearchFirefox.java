package com.selenium.drivers.locators.GuviSeleniumFirefoxDriverLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipediaSearchFirefox {

    public static void main(String[] args) {
        // Set the path to GeckoDriver (replace with your actual path)
        System.setProperty("webdriver.gecko.driver", "E:\\ne guvi java\\firefor drivers\\geckodriver.exe");

        // Step 1: Initialize WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        try {
            // Step 2: Maximize the browser window
            driver.manage().window().maximize();

            // Step 3: Navigate to Wikipedia homepage
            String url = "https://www.wikipedia.org/";
            driver.get(url);

            // Step 4: Search for "Artificial Intelligence"
            WebElement searchBox = driver.findElement(By.id("searchInput"));
            searchBox.sendKeys("Artificial Intelligence");
            WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
            searchButton.click();

            // Step 5: Click on the "History" section
            WebElement historySection = driver.findElement(By.xpath("//h2[@id='History']"));
            historySection.click();

            // Step 6: Print the title of the "History" section
            String sectionTitle = historySection.getText();
            System.out.println("The title of the section is: " + sectionTitle);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 7: Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
