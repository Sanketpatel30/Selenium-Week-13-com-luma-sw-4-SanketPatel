package com.softwaretestingboard.mageto.www.pages;

import com.softwaretestingboard.mageto.www.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends Utility {
    By WomenMenuOption = By.xpath("//span[contains(text(),'Women')]");

    public void mouseHoverOnWomenMenuTab() {
        mouseHoverToElement(WomenMenuOption);
    }

    By mouseHoverOnTopMenuOption = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    public void mouseHoverOnWomenTopMenuOption() {
        mouseHoverToElement(mouseHoverOnTopMenuOption);
    }

    By jacketsOption = By.xpath("//a[@id='ui-id-11']");

    public void setJacketsOption() {
        clickOnElement(jacketsOption);
    }

    By sortProductNameInDropDownOption = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");

    public void productSortByProductName(String product) {
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
    }

    By menMenuOption = By.xpath("//span[normalize-space()='Men']");

    public void mouseHoverOnMenMenuTab() {
        mouseHoverToElement(menMenuOption);
    }

    By mouseHoverOnBottomsMenuOption = By.xpath("//a[@id='ui-id-18']");

    public void mouseHoverOnMenBottomsMenuOption() {
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }

    By pantsOption = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    public void setPantsOption() {
        clickOnElement(pantsOption);
    }

    By mouseHoverOnProductNameOption = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    public void mouseHoverOnMenPantsProductNameOption() {
        mouseHoverToElement(mouseHoverOnProductNameOption);
    }

    By mouseHoverAndClickOnProductNameOption = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    By mouseHoverAndClickOnColourNameOption = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    By mouseHoverAndClickOnAddToCartOption = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    By addedToYourShoppingCartMethodText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }

    By shoppingCartOption = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCartOption() {
        clickOnElement(pantsOption);
    }

    By shoppingCartTextMethod = By.xpath("//span[@class='base']");

    public String shoppingCartText() {
        return getTextFromElement(shoppingCartTextMethod);
    }

    By pantTextMethod = By.xpath("//a[@class='product photo product-item-photo']//img[@alt='Cronus Yoga Pant ']");

    public String cronusPantText() {
        return getTextFromElement(pantTextMethod);
    }

    By sizeTextMethod = By.xpath("//dd[contains(text(),'32')]");

    public String verifySizeText() {
        return getTextFromElement(sizeTextMethod);
    }

    By colourTextMethod = By.xpath("//dd[contains(text(),'Black')]");

    public String verifyColourOfPantText() {
        return getTextFromElement(colourTextMethod);
    }


    By mouseHoverOnGearOption = By.xpath("//span[normalize-space()='Gear']");

    public void mouseHoverOnGearMenuOption() {
        mouseHoverToElement(mouseHoverOnGearOption);
    }

    By mouseHoverGearAndClickOption = By.xpath("(//span[normalize-space()='Gear']");

    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    By duffleBagOption = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    public void clickODuffleBagOption() {
        clickOnElement(duffleBagOption);
    }

    By overNightDuffleText = By.xpath("//span[@class='base']");

    public String verifyOvernightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    By quantityOption = By.xpath("//input[@id='qty']");

    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }

    By youAddedText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        return getTextFromElement(youAddedText);
    }

    By cartOption = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCartLinkOption() {
        clickOnElement(cartOption);
    }

    By nightDuffleText = By.xpath("//span[@class='base']");

    public String verifyOvernightDuffleTextMethod() {
        return getTextFromElement(nightDuffleText);
    }

    By qtyText = By.xpath("//input[@title='Qty']");

    public String verifyQuantityText() {
        return getTextFromElement(qtyText);
    }

    By priceText = By.xpath("//span[@class='cart-price']//span)[2]");

    public String verifyProductPrice() {
        return getTextFromElement(priceText);
    }

    By qtyOption = By.xpath("//input[@id='qty']");

    public void quantityUpdateText() {
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }

    By shopCartOption = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCartButtonOption() {
        clickOnElement(shopCartOption);
    }

    By priceTextMethod = By.xpath("/span[@class='cart-price']//span)[2]");

    public String verifyUpdatedPriceText() {
        return getTextFromElement(priceTextMethod);
    }
}