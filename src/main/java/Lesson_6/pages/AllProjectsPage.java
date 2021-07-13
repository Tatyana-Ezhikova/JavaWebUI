package Lesson_6.pages;

import Lesson_6.Base.BaseView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class AllProjectsPage extends BaseView {
    @FindBy(linkText = "Создать проект")
    private WebElement createNewProjectButton;

    public AllProjectsPage(WebDriver driver) {
        super(driver);
    }
    public NewProjectPage clickOnCreateNewProjectButton() {
        createNewProjectButton.click();
        return new NewProjectPage(driver);
    }

    public AllProjectsPage checkNewProjectPopUp() {
        String message = wait10second.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
                "div[class='message']"))).getText();
        assertTrue(message.contains("Проект сохранен"));
        return this;
    }

}
