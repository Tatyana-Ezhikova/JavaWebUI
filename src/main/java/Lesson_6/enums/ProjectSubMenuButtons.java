package Lesson_6.enums;

import Lesson_6.Base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ProjectSubMenuButtons implements SubMenuButtons {
    MY_PROJECTS_REQUEST(".//span[@class='title' and text()='Мои проекты']");

    private final By by;

    ProjectSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
