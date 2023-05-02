package com.softwaretestingboard.mageto.www.testsuite;

import com.softwaretestingboard.mageto.www.pages.HomePage;
import com.softwaretestingboard.mageto.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverOnGearMenuOption();
        homePage.mouseHoverOnGearMenuAndClicksOnBagsOption();
        homePage.clickODuffleBagOption();
        String expectedMessage = "Overnight Duffle";
        Assert.assertEquals(homePage.verifyOvernightDuffleText(),
                expectedMessage, "Overnight Duffle Text is not displayed");
        homePage.quantitySpaceOption();
        String expectedMessage1 = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(homePage.verifyYouAddedOvernightDuffleToYourShoppingCartText(),
                expectedMessage1, "Text is not displayed");
        homePage.clickOnShoppingCartLinkOption();
        String expectedMessage2 = "Overnight Duffle";
        Assert.assertEquals(homePage.verifyOvernightDuffleTextMethod(),
                expectedMessage2, "Overnight Duffle Text is not displayed");
        String expectedMessage3 = "3";
        Assert.assertEquals(homePage.verifyQuantityText(),
                expectedMessage3, "Correct Quantity is not displayed");
        String expectedMessage4 = "$135.00";
        Assert.assertEquals(homePage.verifyProductPrice(),
                expectedMessage4, "Correct Price is not displayed");
        homePage.quantityUpdateText();
        homePage.clickOnShoppingCartButtonOption();
        String expectedMessage5 = "$225.00";
        Assert.assertEquals(homePage.verifyOvernightDuffleTextMethod(),
                expectedMessage5, "Incorrect Price is displayed");

    }

}