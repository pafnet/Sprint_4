package net.paf;

import org.junit.Assert;
import org.junit.Test;

public class ScooterOrder extends BeforeAfter {

    @Test
    public void ScooterOrderButtonMiddle() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCookieButton();
        homePage.clickOrderButtonMiddle();
        RentalOrder rentalOrder = new RentalOrder(webDriver);
        rentalOrder.inputName("Сергей");
        rentalOrder.inputSurname("Шевелёв");
        rentalOrder.inputAdress("ул. Мясницкая, 24.7");
        rentalOrder.inputUnderground("Лубянка");
        rentalOrder.clickUnderground(rentalOrder.Lubyanka);
        rentalOrder.inputPhone("+79037339074");
        rentalOrder.clickButtonFurther();
        rentalOrder.insertDates("28.05.2023");
        rentalOrder.clickEmptySpace();
        rentalOrder.clickRentalPeriod();
        rentalOrder.click7Day();
        rentalOrder.clickBlack();
        rentalOrder.CommentForСourier("Цвет самоката можно любой");
        rentalOrder.clickButtonOrderMiddle();
        rentalOrder.clickYesButtonConfirmOrder();
        boolean isDisplayed = rentalOrder.displayingButtonViewOrder();
        Assert.assertTrue("'Посмотреть статус' отсутствует", isDisplayed);
    }
        @Test
        public void ScooterOrderButton() {
            HomePage homePage = new HomePage(webDriver);
            homePage.clickOrderButton();
            RentalOrder rentalOrder = new RentalOrder(webDriver);
            homePage.clickCookieButton();
            rentalOrder.inputName("Павел");
            rentalOrder.inputSurname("Лапшин");
            rentalOrder.inputAdress("мкр. Павлино, 16");
            rentalOrder.inputUnderground("Чистые Пруды");
            rentalOrder.clickUnderground(rentalOrder.ChistyePrudy);
            rentalOrder.inputPhone("+79037339082");
            rentalOrder.clickButtonFurther();
            rentalOrder.insertDates("12.04.2023");
            rentalOrder.clickEmptySpace();
            rentalOrder.clickRentalPeriod();
            rentalOrder.click4Day();
            rentalOrder.clickGrey();
            rentalOrder.clickButtonOrderMiddle();
            rentalOrder.clickYesButtonConfirmOrder();
            boolean isDisplayed = rentalOrder.displayingButtonViewOrder();
            Assert.assertTrue("'Посмотреть статус' отсутствует", isDisplayed);
        }
    }

