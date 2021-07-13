package Lesson_6.views;

import Lesson_6.Base.BaseView;
import Lesson_6.Base.SubMenu;
import Lesson_6.Base.SubMenuButtons;
import Lesson_6.enums.ProjectSubMenuButtons;
import Lesson_6.pages.AllProjectsPage;
import org.openqa.selenium.WebDriver;

public class ProjectSubMenu extends SubMenu {
    public ProjectSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectSubMenuButtons) {
            switch ((ProjectSubMenuButtons) buttons) {
                case MY_PROJECTS_REQUEST:
                    driver.findElement(((ProjectSubMenuButtons) buttons).getBy()).click();
                    return new AllProjectsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}