package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SeleniumExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ithillel.ua/");

        WebElement programCourses = driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div"));
        programCourses.click();

        WebElement frontEndBasic = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]"));
        frontEndBasic.click();
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,2700)");

        WebElement showAll = driver.findElement(By.xpath("/html/body/div[1]/main/section[6]/div/div/button"));
        showAll.click();
        List<WebElement> instructors = driver.findElements(By.xpath("//*[@id=\"coachesSection\"]/div/div/ul"));

        for (WebElement instructor : instructors) {
            System.out.println(instructor.getText());
        }
        driver.quit();
        }
    }
