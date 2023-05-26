package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TestingPage {
    private WebDriver driver;

    public TestingPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getCourses(){
        return this.driver.findElement(By.cssSelector("#body > div.site-wrapper > main > section.section.-opportunities"));
    }
    public WebElement getAdditionalCourses(){
        return this.driver.findElement(By.cssSelector("#categories > div.profession > div > ul > li > div > div:nth-child(2) > ul"));
    }
    public WebElement getOpportunities(){
        return this.driver.findElement(By.cssSelector("#body > div.site-wrapper > main > section.section.-opportunities"));
    }
    public WebElement goToCategory(String category){
        return this.driver.findElement(By.cssSelector("#categories > div > ul > li:nth-child(1)"));

    }
}
