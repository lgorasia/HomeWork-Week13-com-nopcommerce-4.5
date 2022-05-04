package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectonicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    BillingPage billingPage = new BillingPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CheckOutCompletedPage checkOutCompletedPage = new CheckOutCompletedPage();







    @Test
    public void textVerified(){
        homePage.clickOnElectronicsField();
        homePage.clickOnCellPhoneField();
        String actualText = cellPhonePage.cellPhoneText();
        String expectedText ="Cell phones";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickOnElectronicsField();
        homePage.clickOnCellPhoneField();
        String actualText = cellPhonePage.cellPhoneText();
        String expectedText ="Cell phones";
        Assert.assertEquals(actualText,expectedText);
        // click on grid view
        cellPhonePage.clickOnGridView();
        // click on nokia and verify the text
        cellPhonePage.clickOnNokia();
        //verify text, price and change quantity and add to cart
        String actualText1 = nokiaLumia1020Page.nokiaLumia();
        String expectedText1 = "Nokia Lumia 1020";
        Assert.assertEquals(actualText1,expectedText1);

        String actualText2 = nokiaLumia1020Page.price();
        String expectedText2 = "$349.00";
        Assert.assertEquals(actualText2,expectedText2);

        nokiaLumia1020Page.setQuantiyField("2");
        Thread.sleep(2000);
        nokiaLumia1020Page.clikcOnAddToCart();
        //basket verification
        String actualText3 =nokiaLumia1020Page.addToCartVerification();
        String expectedText3= "The product has been added to your shopping cart";
        Assert.assertEquals(actualText3,expectedText3);
        nokiaLumia1020Page.closeGreenBar();
        Thread.sleep(2000);
        nokiaLumia1020Page.shppingcartSelection();
        nokiaLumia1020Page.selectGoToBasket();
        //verify shopping cart,total

        String actualText4 =cartPage.shoppingCartText();
        String expectedText4= "Shopping cart";
        Assert.assertEquals(actualText4,expectedText4);

        String actualText5 = cartPage.totalForNokia();
        String expectedText5 = "$698.00";
        Assert.assertEquals(actualText5,expectedText5);
        //agree terms and check out
        cartPage.agreedTerms();
        cartPage.checkOut();
        //welcome and register
        String actualText6 =loginPage.getWelcomeText();
        String expectedText6 = "Welcome, Please Sign In!";
        Assert.assertEquals(actualText6,expectedText6);
        loginPage.clickOnRegistration();

        //Verify registration and enter all the details

        String actualText7 = registerPage.registration();
        String expectedText7 = "Register";
        Assert.assertEquals(actualText7,expectedText7);

        registerPage.enterFirstName("Manoj");
        registerPage.enterLastName("Patel");
        registerPage.gender();
        registerPage.selectDay("28");
        registerPage.selectMonth("May");
        registerPage.selectYear("1974");
        registerPage.enterEmail("6abcdefgh@gmail.com");
        registerPage.enterPassword("123456789");
        registerPage.enterConfirmPassword("123456789");
        registerPage.clickOnRegistration();
        String actualText8 =registerPage.registrationCompliton();
        String expectedText8 = "Your registration completed";
        Assert.assertEquals(expectedText8,actualText8);
        Thread.sleep(500);
        registerPage.clickOnContinue();
        //verigy shopping cart.agreed terms and condition, checkout
        Thread.sleep(500);
        String actualText9=cartPage.shoppingCartText();
        String expectedText9 = "Shopping cart";
        Assert.assertEquals(actualText9,expectedText9);
        cartPage.agreedTerms();
        cartPage.checkOut();
        //enter details
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
        //Shipping
        shippingPage.clickOnNokiaDeliveryOption();
        shippingPage.clickContinue();

        //Select paymentMethod
        paymentMethodPage.clickOnCreditCard();
        paymentMethodPage.continueButton();
        //Payment
        paymentInfoPage.clickOnCardType("Visa");
        paymentInfoPage.clickOnName("Karan");
        paymentInfoPage.clickOncardNumber("1111 2222 3333 4444");
        paymentInfoPage.expiryMonth("02");
        paymentInfoPage.expiryYear("2023");
        paymentInfoPage.clickOnCardCode("256");
        paymentInfoPage.continueButton();

        //verify payment,shipping,total
        Thread.sleep(500);
        String actualText10 =confirmOrderPage.payment();
        String expectedText10 = "Credit Card";
        Assert.assertEquals(actualText10,expectedText10);

        Thread.sleep(500);
        String actualText11= confirmOrderPage.deliveryMethod();
        String expectedText11= "2nd Day Air";
        Assert.assertEquals(actualText11,expectedText11);

        Thread.sleep(500);
        String actualText12 = confirmOrderPage.total();
        String expectedText12 = "$698.00";
        Assert.assertEquals(actualText12,expectedText12);

        confirmOrderPage.confirmbutton();

        // checkOut completed
        String actualText13= checkOutCompletedPage.thankYou();
        String expectedText13 = "Thank you";
        Assert.assertEquals(actualText13,expectedText13);

        String actualText14 = checkOutCompletedPage.orderProcessedMessage();
        String expectedText14 = "Your order has been successfully processed!";
        Assert.assertEquals(actualText14,expectedText14);

        checkOutCompletedPage.clickOnContinue();


        //Veryfy url
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        org.junit.Assert.assertEquals(expectedUrl, actualUrl);






    }


}
