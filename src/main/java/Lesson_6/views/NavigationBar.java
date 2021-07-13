package Lesson_6.views;

import Lesson_6.Base.BaseView;
import Lesson_6.enums.NavigationBarTabs;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationBar extends BaseView {

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public ProjectSubMenu moveCursorToNavigationTab(NavigationBarTabs tab) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();
        switch (tab) {
            case COUNTER_PARTIES:
                return new ProjectSubMenu(driver);
            case PROJECTS:
                return new ProjectSubMenu(driver);
            default:
                throw new IllegalArgumentException("Another tabs currently not implemented");
        }
    }

    public NavigationBar checkTabVisibility(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return this;
    }
}

