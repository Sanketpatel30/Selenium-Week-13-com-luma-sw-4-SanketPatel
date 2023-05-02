package com.softwaretestingboard.mageto.www.testsuite;

import com.softwaretestingboard.mageto.www.pages.HomePage;
import com.softwaretestingboard.mageto.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        homePage.mouseHoverOnMenMenuTab();
        homePage.mouseHoverOnMenBottomsMenuOption();
        homePage.setPantsOption();
        homePage.mouseHoverOnMenPantsProductNameOption();
        homePage.mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption("32");
        homePage.mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption("Black");
        homePage.mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption();
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        Assert.assertEquals(homePage.youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText(),
                expectedMessage, "Text displayed is incorrect");
        homePage.clickOnShoppingCartOption();
        String expectedMessage1 = "Shopping Cart";
        Assert.assertEquals(homePage.shoppingCartText(),
                expectedMessage1, "Cart displayed is incorrect");
        String expectedMessage2 = "Cronus Yoga Pant";
        Assert.assertEquals(homePage.cronusPantText(),
                expectedMessage2, "Pant displayed is incorrect");
        String expectedMessage3 = "32";
        Assert.assertEquals(homePage.verifySizeText(),
                expectedMessage3, "Size displayed is incorrect");
        String expectedMessage4 = "Black";
        Assert.assertEquals(homePage.verifyColourOfPantText(),
                expectedMessage4, "Colour displayed is incorrect");

    }
}