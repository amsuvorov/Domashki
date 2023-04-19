package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestingPage {
    private WebDriver driver;

    public TestingPage(WebDriver driver) {
        this.driver = driver;
    }


    public List<WebElement> getCourses() {
        return driver.findElements(By.xpath("/html/body/div[2]/main/section[1]/div[2]/div/ul/li/div"));
    }

    public List<WebElement> getAdditionalCourses() {
        return driver.findElements(By.xpath("/html/body/div[2]/main/section[1]/div[2]/div/ul/li/div/div[2]/ul/li/a/div[2]"));
    }

    public WebElement getOportunities() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/section[2]"));
    }

    public void goToCategory(String category) {
        driver.findElement(By.xpath("/html/body/div[2]/main/section[1]/div[1]/div/ul"))
                .click();
    }
}
