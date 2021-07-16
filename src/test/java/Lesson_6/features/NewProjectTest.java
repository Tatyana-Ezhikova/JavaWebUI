package Lesson_6.features;

import Lesson_6.Base.BaseUITest;
import Lesson_6.common.Configuration;
import Lesson_6.enums.NavigationBarTabs;
import Lesson_6.enums.ProjectSubMenuButtons;
import Lesson_6.pages.AllProjectsPage;
import Lesson_6.pages.LoginPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

@Feature("Project")
public class NewProjectTest extends BaseUITest {
    @Test
    public void createNewProjectPositiveTest() throws InterruptedException {
        AllProjectsPage projectScreen = (AllProjectsPage)  new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.PROJECTS)
                .clickSubMenuButton(ProjectSubMenuButtons.MY_PROJECTS_REQUEST);
        Thread.sleep(5000);

        projectScreen
                .clickOnCreateNewProjectButton()
                .enterName(getRandomWord(6))
                .enterOrganization("1234")
                .enterContact("123 123")
                .enterDept("Research & Development")
                .enterHead("Applanatest Applanatest Applanatest")
                .enterBoss("Applanatest Applanatest Applanatest")
                .enterAdmin("Applanatest Applanatest Applanatest")
                .enterManager("Applanatest Applanatest Applanatest")
                .clickSubmit()
                .checkNewProjectPopUp();
    }

    //случайное имя
    String getRandomWord(int length) {
        String r = "";
        for(int i = 0; i < length; i++) {
            r += (char)(Math.random() * 26 + 97);
        }
        return r;
    }
}
