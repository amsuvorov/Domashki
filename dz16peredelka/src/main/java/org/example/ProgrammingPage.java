package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProgrammingPage extends Page{
    SelenideElement getCourses() {
        return $(By.xpath("//*[@id=\"categories\"]/div[3]"));
    }

    SelenideElement getAdditionalCourses() {
        return $(By.xpath("//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[2]"));
    }

    SelenideElement getOportunities() {
        return $(By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]"));
    }

    SelenideElement getLanguage() {
        return $(By.xpath("//*[@id=\"categories\"]/div[2]/ul"));
    }

    void goToCategory(String category) {
        $(By.xpath("//*[@id=\"categories\"]/div/ul/li[5]"))
                .click();
    }
}
