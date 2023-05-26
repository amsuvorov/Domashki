package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static  void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    
        driver.get("https://ithillel.ua/courses/testing");
    TestingPage testingPage = new TestingPage(driver);
        System.out.println(testingPage.getCourses().getText());
        System.out.println(testingPage.getOpportunities().getText());
        System.out.println(testingPage.getAdditionalCourses().getText());
        testingPage.goToCategory("Programing").click();
        driver.quit();

}
}