package org.example;

import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import javafx.scene.web.WebEngine;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.open;

public class Main { public static void main(String[] args) {

    open("https://ithillel.ua/courses/testing");

    TestingPage testingPage = new TestingPage();
    System.out.println("Courses: " + testingPage.getCourses().getText());
    System.out.println("Additional courses: " + testingPage.getAdditionalCourses().getText());
    System.out.println("Opportunities: " + testingPage.getOportunities().getText());
    testingPage.goToCategory("Programming");

    ProgrammingPage programmingPage = new ProgrammingPage();
    System.out.println("Courses: " + programmingPage.getCourses().getText());
    System.out.println("Additional courses: " + programmingPage.getAdditionalCourses().getText());
    System.out.println("Opportunities: " + programmingPage.getOportunities().getText());
    System.out.println("Language: " + programmingPage.getLanguage().getText());
    programmingPage.goToCategory("Design");

    DesignPage designPage = new DesignPage();
    System.out.println("Courses: " + designPage.getCourses().getText());
    System.out.println("Opportunities: " + designPage.getOportunities().getText());
    designPage.goToCategory("Testing");
}
}