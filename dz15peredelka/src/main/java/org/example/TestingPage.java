package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage {
    private WebDriver driver;

    public TestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCourses() {
        return this.driver.findElement(By.cssSelector("#body > div.site-wrapper > main > section.section.-opportunities"));
    }

    public WebElement getAdditionalCourses() {
        return this.driver.findElement(By.cssSelector("#categories > div.profession > div > ul > li > div > div:nth-child(2) > ul"));
    }

    public WebElement getOpportunities() {
        return this.driver.findElement(By.cssSelector("#body > div.site-wrapper > main > section.section.-opportunities"));
    }



    public void goToCategory(String category) {
        switch (category.toLowerCase()) {

            case "programming":
                this.driver.findElement(By.cssSelector("#categories > div > ul > li:nth-child(1)")).click();
                break;
            case "management":
                this.driver.findElement(By.cssSelector("#categories > div > ul > li:nth-child(3)")).click();
                break;
            case "marketing":
                this.driver.findElement(By.cssSelector("#categories > div > ul > li:nth-child(4)")).click();
                break;
