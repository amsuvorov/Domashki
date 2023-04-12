package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class SeleniumExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");

        WebElement programCourses = driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div"));
        programCourses.click();

        WebElement frontEndBasic = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]"));
        frontEndBasic.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement instructorsList = driver.findElement(By.xpath("/html/body/div[2]/main/section[6]/div/div/ul"));
        List<WebElement> instructorElements = instructorsList.findElements(By.xpath("/html/body/div[1]/main/section[6]/div/div/ul/li[1]/a/div/div[2]/p[1]"));
        for (WebElement instructor : instructorElements) {
            String instructorName = instructor.getText();
            System.out.println("Instructor: " + instructorName);
        }

    }
}
