package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginPageTests extends BaseTests {



    @BeforeClass
    public void openLink() {
        homePage.openPage("Form Authentication");
    }

    @Test
    public void testLoginWithValidCredentials() {
        elementActions.enterText(By.id("username"),"tomsmith");
        elementActions.enterText(By.id("password"),"SuperSecretPassword!");
        elementActions.clickOn(By.className("radius"));
        String text = elementActions.getElementText(By.id("flash"));
        Assert.assertTrue(text.contains("You logged into a secure area!"));

    }


}
