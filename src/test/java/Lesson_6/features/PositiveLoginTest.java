package Lesson_6.features;

import Lesson_6.Base.BaseUITest;
import Lesson_6.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static Lesson_6.common.Configuration.*;

public class PositiveLoginTest extends BaseUITest {

    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .checkUrl(BASE_URL);
    }
}
