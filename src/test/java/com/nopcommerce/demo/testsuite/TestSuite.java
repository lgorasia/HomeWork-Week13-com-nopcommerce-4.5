package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    BillingPage billingPage = new BillingPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CheckOutCompletedPage checkOutCompletedPage = new CheckOutCompletedPage();



    @Test
    public void verifyProductArrangeInDecendingOrder() {
        homePage.clickOnComputer();
        computerPage.desktop();
        desktopsPage.arrangeAtoZPosition();}

   @Test
      public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //Select desktop and add to cart
       homePage.clickOnComputer();
       computerPage.desktop();
       desktopsPage.arrangeAtoZPosition();
       Thread.sleep(2000);
       desktopsPage.clickAddInCart();
       String actualText =buildYourOwnComputer.buildYourComputerText();
       String expectedText ="Build your own computer";
       Assert.assertEquals(actualText,expectedText);

       //select component and add to cart
       buildYourOwnComputer.selectProcessorFromDropdown();
       Thread.sleep(1000);
       buildYourOwnComputer.selecRamFromFromDropdown();
       Thread.sleep(1000);
       buildYourOwnComputer.clickOnHddRadio();
       Thread.sleep(1000);
       buildYourOwnComputer.osRadio();
       Thread.sleep(1000);
       buildYourOwnComputer.clickSoftware();
       Thread.sleep(2000);
       String actualText1 =buildYourOwnComputer.varifyPrice();
       String expectedText1 = "$1,475.00";
       Assert.assertEquals(actualText1,expectedText1);
       Thread.sleep(1000);
       buildYourOwnComputer.addtocart();

       //Add to cart verification and close the greet bar
       String actualText2 = buildYourOwnComputer.addToCartVerification();
       String expectedText2 = "The product has been added to your shopping cart";
       Assert.assertEquals(actualText2,expectedText2);
       buildYourOwnComputer.closeGreenBar();

       //click on cart
       Thread.sleep(3000);
       buildYourOwnComputer.shppingcartSelection();
       buildYourOwnComputer.selectGoToBasket();

       //verify shopping cart
       String actualText3 = cartPage.shoppingCartText();
       String expectedText3 = "Shopping cart";
       Assert.assertEquals(actualText3,expectedText3);
       //change quantity 2
       Thread.sleep(1000);
       cartPage.clearQuantity("2");
       cartPage.updateCart();
       //agreed terms and check out
       cartPage.agreedTerms();
       Thread.sleep(1000);
       cartPage.checkOut();
       // welcome message and continue as guest
       String expectedText4 = "Welcome, Please Sign In!";
       String actualText4 = loginPage.getWelcomeText();
       loginPage.checkOutsAsGuest();

       //Billing
       billingPage.clickOnFirstName("Aanand");
       Thread.sleep(500);
       billingPage.clickOnLastName("Kumar");
       Thread.sleep(500);
       billingPage.clickOnEmail("aanandkumar@gmail.com");
       Thread.sleep(500);
       billingPage.selectCountry();
       Thread.sleep(500);
       billingPage.selectCity("London");
       Thread.sleep(500);
       billingPage.selectAddress("21 ABC Street");
       Thread.sleep(500);
       billingPage.selectPostCode("HA2 8RT");
       Thread.sleep(500);
       billingPage.selectPhoneNumber("07452362548");
       Thread.sleep(500);
       billingPage.clickOnContinue();

       // select shipping and continue
       shippingPage.deliveryMethod();
       shippingPage.clickContinue();

       //Select paymentMethod
       paymentMethodPage.clickOnCreditCard();
       paymentMethodPage.continueButton();

       // payment info
       Thread.sleep(1000);
        paymentInfoPage.clickOnCardType("Master card");
        paymentInfoPage.clickOnName("Karan");
        paymentInfoPage.clickOncardNumber("1111 2222 3333 4444");
        paymentInfoPage.expiryMonth("02");
        paymentInfoPage.expiryYear("2023");
        paymentInfoPage.clickOnCardCode("256");
        paymentInfoPage.continueButton();

        //verification

       String actualText5 =confirmOrderPage.payment();
       String expectedText5 = "Credit Card";
       Assert.assertEquals(actualText5,expectedText5);

       String actualText6 = confirmOrderPage.deliveryMethod();
       String expectedText6= "Next Day Air";
       Assert.assertEquals(actualText6,expectedText6);

       String actualText7 = confirmOrderPage.total();
       String expectedText7 = "$2,950.00";
       Assert.assertEquals(actualText7,expectedText7);

       confirmOrderPage.confirmbutton();

        // complition
      String actualText8= checkOutCompletedPage.thankYou();
      String expectedText8 = "Thank you";
      Assert.assertEquals(actualText8,expectedText8);

      String actualText9 = checkOutCompletedPage.orderProcessedMessage();
      String expectedText9 = "Your order has been successfully processed!";
      Assert.assertEquals(actualText9,expectedText9);

      checkOutCompletedPage.clickOnContinue();
      //Welcome to our Store

       String actualText10 = loginPage.welcomeToOurStore();
       String expectedText10 = "Welcome to our store";
       Assert.assertEquals(actualText10,expectedText10);













    }

        }



