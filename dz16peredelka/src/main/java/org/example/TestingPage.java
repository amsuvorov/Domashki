package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestingPage extends  Page{
    @Override
    SelenideElement getCourses() {
        return  $(By.xpath("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[1]"));
    }
    SelenideElement getAdditionalCourses() {
        return $(By.xpath("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[2]"));
    }

    SelenideElement getOportunities() {
        return $(By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]"));
    }

    void goToCategory(String category) {
        $(By.xpath("//*[@id=\"categories\"]/div/ul/li[1]"))
                .click();
    }
}
