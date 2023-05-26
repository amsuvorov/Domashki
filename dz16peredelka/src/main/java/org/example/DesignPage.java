package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DesignPage extends Page{
    SelenideElement getCourses() {
        return $(By.xpath("//*[@id=\"categories\"]/div[2]"));
    }

    @Override
    SelenideElement getAdditionalCourses() {
        return null;
    }


    SelenideElement getOportunities() {
        return $(By.cssSelector("#body > div.site-wrapper > main > section.section.-opportunities"));
    }

    void goToCategory(String category) {
        $(By.xpath("//*[@id=\"categories\"]/div/ul/li[2]"))
                .click();
    }
}
