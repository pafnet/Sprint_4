package net.paf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class RentalOrder extends Main {

    protected RentalOrder(WebDriver webDriver) {
        super(webDriver);
    }

   // поле для ввода имени
    private By inputName = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    // поле для ввода фамилии
    private By inputSurname = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    // поле для ввода адреса
    private By inputAdress = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    // поле для ввода станции метро
    private By inputUnderground = By.xpath(".//div[@class='select-search__value']/input[@placeholder='* Станция метро']");
    // клик по станции метро "Чистые пруды"
    protected By ChistyePrudy = By.xpath(".//button[@value='8']");
    // клик по станции метро "Лубянка"
    protected By Lubyanka = By.xpath(".//button[@value='9']");
    // поле для ввода номера телефона
    private By inputPhone = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    // кнопка "Далее"
    private By buttonFurther = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // поле для выбора даты
    private By inputDateDelivety = By.xpath(".//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']");
    // поле для выбора срока аренды
    private By inputRentalPeriod = By.xpath(".//div[@class='Dropdown-control']/div[@class='Dropdown-placeholder']");
    // клик "семеро суток"
    private By checkBox7Day = By.xpath(".//div[@class='Dropdown-menu']/div[7]");
    // клик "четверо суток"
    private By checkBox4Day = By.xpath(".//div[@class='Dropdown-menu']/div[4]");
    //  заголовок "Про аренду"
    private By headingSamokat = By.xpath(".//div[@class='Order_Header__BZXOb']");
    // чекбокс "черный жемчуг"
    private By checkboxBlack = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='black']");
    // чекбокс "серая безысходность"
    private By checkboxGrey = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='grey']");
    // поле для ввода комментария
    private By commentСourier = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    // кнопка "Заказать"
    private By buttonOrderMiddle = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // кнопка "Да" для подтверждения заказа
    private By yesButtonConfirmButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() ='Да']");
    // кнопка "Посмотреть статус"
    private By buttonViewOrder = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']");

    public void inputName(String text) {
        webDriver.findElement(inputName).sendKeys(text);
    }
    public void inputSurname(String text) {
        webDriver.findElement(inputSurname).sendKeys(text);
    }
    public void inputAdress(String text) {
        webDriver.findElement(inputAdress).sendKeys(text);
    }
    public void inputUnderground(String text) {
        webDriver.findElement(inputUnderground).sendKeys(text);
    }
    public void clickUnderground(By metro) {
        webDriver.findElement(metro).click();
    }
    public void inputPhone(String phone) {
        webDriver.findElement(inputPhone).sendKeys(phone);
    }
    public void clickButtonFurther() {
        webDriver.findElement(buttonFurther).click();
    }
    public void insertDates (String text) {
        webDriver.findElement(inputDateDelivety).sendKeys(text);
    }

    public void clickRentalPeriod () {
        webDriver.findElement(inputRentalPeriod).click();
    }
    public void click4Day () {
        webDriver.findElement(checkBox4Day).click();
    }

    public void click7Day() {
        webDriver.findElement(checkBox7Day).click();
    }

    public void clickEmptySpace() {
        webDriver.findElement(headingSamokat).click();
    }

    public void clickGrey() {
        webDriver.findElement(checkboxGrey).click();
    }

    public void clickBlack() {
        webDriver.findElement(checkboxBlack).click();
    }

    public void clickButtonOrderMiddle() {
        webDriver.findElement(buttonOrderMiddle).click();
    }

    public void clickYesButtonConfirmOrder() {
        webDriver.findElement(yesButtonConfirmButton).click();
    }

    public boolean displayingButtonViewOrder () {
        return webDriver.findElement(buttonViewOrder).isDisplayed();
    }

    public void writeCommentForCourier(String text) {
        webDriver.findElement(commentСourier).sendKeys(text);
    }

}
