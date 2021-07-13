package Lesson_6.views;

import Lesson_6.Base.BaseView;
import Lesson_6.Base.SubMenu;
import Lesson_6.Base.SubMenuButtons;
import Lesson_6.enums.ContactSubMenuButtons;
import Lesson_6.pages.AllContactsPage;
import org.openqa.selenium.WebDriver;

public class ContactSubMenu extends SubMenu {
    public ContactSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ContactSubMenuButtons) {
            switch ((ContactSubMenuButtons) buttons) {
                case CONTACTS_REQUEST:
                    driver.findElement(((ContactSubMenuButtons) buttons).getBy()).click();
                    return new AllContactsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}