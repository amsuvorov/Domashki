package org.example;

import com.codeborne.selenide.SelenideElement;

abstract class Page {
   abstract SelenideElement getCourses();
  abstract SelenideElement getAdditionalCourses();
   abstract SelenideElement getOportunities();
   abstract void goToCategory(String category);
}
