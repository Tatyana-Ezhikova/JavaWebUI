package Lesson_6.features;

import Lesson_6.Base.BaseUITest;
import Lesson_6.common.Configuration;
import Lesson_6.enums.ContactSubMenuButtons;
import Lesson_6.enums.NavigationBarTabs;
import Lesson_6.pages.AllContactsPage;
import Lesson_6.pages.LoginPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

@Feature("Contact")
public class NewContactTest extends BaseUITest {

    @Test
    public void createNewContactPositiveTest() throws InterruptedException {
        AllContactsPage contactScreen = (AllContactsPage) new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.COUNTER_PARTIES)
                .clickSubMenuButton(ContactSubMenuButtons.CONTACTS_REQUEST);
        Thread.sleep(10000);

        contactScreen
                .clickOnCreateNewContactButton()
                .enterLastName("Иванов123")
                .enterFirstName("Иван")
                .selectExpenditure("1234")
                .enterPosition("Менеджер")
                .clickSubmit()
                .checkNewContactPop();
    }

}
