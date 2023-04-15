package net.paf;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuestionListAbout extends BeforeAfter {

    private final String question;
    private final By questionLocator;

    public QuestionListAbout(String question, By questionLocator) {
        this.question = question;
        this.questionLocator = questionLocator;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        Object[][] data = new Object[][]{
                {"Сколько это стоит? И как оплатить?", By.id("accordion__heading-0")},
                {"Хочу сразу несколько самокатов! Так можно?", By.id("accordion__heading-1")},
                {"Как рассчитывается время аренды?", By.id("accordion__heading-2")},
                {"Можно ли заказать самокат прямо на сегодня?", By.id("accordion__heading-3")},
                {"Можно ли продлить заказ или вернуть самокат раньше?", By.id("accordion__heading-4")},
                {"Вы привозите зарядку вместе с самокатом?", By.id("accordion__heading-5")},
                {"Можно ли отменить заказ?", By.id("accordion__heading-6")},
                {"Я жизу за МКАДом, привезёте?", By.id("accordion__heading-7")}
        };
        return Arrays.asList(data);
    }

    @Test
    public void questionlistAbout() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(questionLocator);
        String actual = homePage.getText(questionLocator);
        Assert.assertEquals(question, actual);
    }
}

