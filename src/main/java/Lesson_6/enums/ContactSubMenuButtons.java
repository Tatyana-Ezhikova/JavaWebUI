package Lesson_6.enums;

import Lesson_6.Base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ContactSubMenuButtons implements SubMenuButtons {
    CONTACTS_REQUEST(".//span[@class='title' and text()='Контактные лица']");

    private final By by;

    ContactSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
