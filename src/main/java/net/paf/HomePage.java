package net.paf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class HomePage extends Main {

    // Кнопка "да все привыкли"
    private By cookieButton = By.id("rcc-confirm-button");
    // первый вопрос "Сколько это стоит? И как оплатить?"
    protected final By question0 = By.id("accordion__heading-0");
    // второй вопрос "Хочу сразу несколько самокатов! Так можно?"
    protected By question1 = By.id("accordion__heading-1");
    // третий вопрос "Как рассчитывается время аренды?"
    protected By question2 = By.id("accordion__heading-2");
    // четвертый вопрос "Можно ли заказать самокат прямо на сегодня?"
    protected By question3 = By.id("accordion__heading-3");
    // пятый вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    protected By question4 = By.id("accordion__heading-4");
    // шестой вопрос "Вы привозите зарядку вместе с самокатом?"
    protected By question5 = By.id("accordion__heading-5");
    // седьмой вопрос "Можно ли отменить заказ?"
    protected By question6 = By.id("accordion__heading-6");
    // восьмой вопрос "Я жизу за МКАДом, привезёте?"
    protected By question7 = By.id("accordion__heading-7");
    // Кнопка "Заказать"
    protected By orderButton = By.className("Button_Button__ra12g");
    // Кнопка "Заказать" посередине
    protected By orderButtonMiddle = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCookieButton () {
    webDriver.findElement(cookieButton).click();
}

    public void scrollToQuestion () {
        WebElement element = webDriver.findElement(question0);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();",element);
    }

    public void clickQuestion (By text) {
        webDriver.findElement(text).click();
    }

    public String getText(By text) {
        return webDriver.findElement(text).getText();
    }

    public void clickOrderButton () {
        webDriver.findElement(orderButton).click();
    }

    public void clickOrderButtonMiddle () {
        webDriver.findElement(orderButtonMiddle).click();
    }
}



