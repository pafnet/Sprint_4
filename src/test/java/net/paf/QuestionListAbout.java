package net.paf;

import org.junit.Assert;
import org.junit.Test;

public class QuestionListAbout extends BeforeAfter {

    @Test
    public void questionlistAbout1() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question0);
        String expected = "Сколько это стоит? И как оплатить?";
        String actual = homePage.getText(homePage.question0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout2() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question1);
        String expected = "Хочу сразу несколько самокатов! Так можно?";
        String actual = homePage.getText(homePage.question1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout3() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question2);
        String expected = "Как рассчитывается время аренды?";
        String actual = homePage.getText(homePage.question2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout4() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question3);
        String expected = "Можно ли заказать самокат прямо на сегодня?";
        String actual = homePage.getText(homePage.question3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout5() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question4);
        String expected = "Можно ли продлить заказ или вернуть самокат раньше?";
        String actual = homePage.getText(homePage.question4);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout6() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question5);
        String expected = "Вы привозите зарядку вместе с самокатом?";
        String actual = homePage.getText(homePage.question5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout7() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question6);
        String expected = "Можно ли отменить заказ?";
        String actual = homePage.getText(homePage.question6);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionlistAbout8() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.scrollToQuestion();
        homePage.clickQuestion(homePage.question7);
        String expected = "Я жизу за МКАДом, привезёте?";
        String actual = homePage.getText(homePage.question7);
        Assert.assertEquals(expected, actual);
    }
}
