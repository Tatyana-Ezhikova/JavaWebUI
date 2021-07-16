package Lesson_6.features;

import Lesson_6.Base.BaseUITest;
import Lesson_6.common.Configuration;
import Lesson_6.enums.NavigationBarTabs;
import Lesson_6.pages.LoginPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Feature("Navigation")
public class NavigationTest extends BaseUITest {

    @ParameterizedTest
    @MethodSource("navigationTabProvider")
    public void checkMainNavigationTabsTest(NavigationBarTabs barTab) {
        new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .checkTabVisibility(barTab);

    }

    static NavigationBarTabs[] navigationTabProvider() {
        return NavigationBarTabs.values();
    }

}
