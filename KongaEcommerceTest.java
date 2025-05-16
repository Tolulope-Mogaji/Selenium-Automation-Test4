import static java.lang.System.*;

public class KongaEcommerceTest {
    public static void main(String[] args) {}

// import the selenium WebDriver
    private WebDriver driver ;

    @BeforeTest

    public void start () throws InterruptedException

    @java.lang.Override
    public java.lang.String toString() {
        return "KongaEcommerceTest{" +
                "driver=" + driver +
                '}';
    }

    public KongaEcommerceTest() {

        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver"."chromedriver.exe");

        //1. Open the Chrome browser

        driver = new WebDriver();

        //2. input the Konga URL page
        // Action Comment: Open chrome Browser and enter the Konga URL Link in the address bar.
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);
        //3. Sign in to Konga Successfully
        // Action Comment: Locate and click on the longin / SignUp menu on the Home Page
        driver .findElement(By.xpath("//*[@id=/div[4]/section/section/div/aside/div[1]/div/h5")).click();
        //Action Comment : Enter valid email address or phone number in the email address / phone number field
        driver .findElement(By.id("username")).sendKeys("Tolulope");
        // Action Comment : Enter valid password in the password field
        driver. findElement (By.id("password")).sendKeys("Tbaby1234");
        //Action Comment : Click on Login field and redirect to Konga dashboard
        driver. findElement (By.xpath("https://www.konga.com/?srsltid=AfmBOorzJxuTtNiHPB05DYjJiO0eacY5sRDyD5hYyXWiWT5dpyzV_N1e")).click();
        Thread.sleep(5000);

        //4.Locate the computer and accesories categories and then click
        driver. findElement (By.xpath("/html/body/div/div/section/div[2]/nav/div[2]/div[2]/div/a[2]")).click();
         Thread.sleep(5000);

        //5.Click on Laptops Subcategory
        //Action Comment: locate laptops subcategory and click
        driver. findElement (By.xpath("/html/body/div/div/section/div[2]/div[1]/div/div/div")).click();
        Thread.sleep(5000)

        //6.Click on Apple Macbooks
        // Locate Apple Macbooks and click on it
        driver. findElement (By.xpath("//*[@id=\"mainContent\"]/section[1]/div/div[1]/div[2]/h1")).click();
        Thread.sleep(5000)

         //7.Add an item to the cart
        // Action Comment:Choose an item and click on it
        driver.findElement (By.xpath("//*[@id=\"mainContent\"]/div[4]/div[1]/div/h1")).click();
        // Add the item to the cart
        driver.findElement (By.xpath("//*[@id=\"mainContent\"]/div[4]/div[3]/div[1]/div[1]/div/div[2]/div[2]/form/div[5]/div[1]/button")).click();

        //8.Select Address
        //Locate the cart field and Click
        driver.findElement (By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/a[3]/span[1]")).click();
        //Locate and click on the continue to checkout
        driver.findElement (By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[4]/div/div[6]/div/a")).click();
        //Locate and click on Add Delivery Address
        driver.findElement (By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
        //Locate and click on "Use this address" button
        driver.findElement ("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/div/aside/div[3]/div/div/div/a")).click();

        //9. Continue to make payment
        // Locate and click on 'Pay Now' option button
        driver.findElement (By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
        //Locate and click on 'Continue to make Payment"button
        driver.findElement (By.xpath("<button class=\"_0a08a_3czMG ec93a_33DRT\" name=\"placeOrder\" type=\"submit\" value=\"kpaygateway\">Continue to Payment</button>")).click();

        //10. Select a card Payment
        //Action Comment: Locate and click 'Select Payment Method'
        driver.findElement (By.xpath("/html/body/section/section/section/div[2]/div[3]/div/div/div[1]/span")).click();
        //Action Comment:Locate and click on 'Card' method
        driver.findElement (By.("/html/body/section/section/section/div[2]/div[3]/div/div/div[2]/div/div[3]/button/div/span[2]")).click();

        //11. Input Invalid Card Details
        //Action Comment:Input invalid card number
        driver.findElement (By.id("card-number")).sendKeys("5555 5555 5555 5555");
        //Action Comment: Input invalid date
        driver.findElement (By.id("expiry")).sendKeys("02/28")
        //Action Comment:Input invalid CVV number
        driver.findElement (By.id("cvv")).sendKeys("222")
        //Action Comment: Input invalid card pin
        drive.findElement (By.id("card-pin-new");sendKeys("2345");
        //Action Comment; Locate and click on "Pay Now' button
        drive.findElement (By.id("validateCardForm")).click();

        //12. Print out the error message:Invalid Card Number
        //Action Comment: Locate and Click on the card number field
        drive.findElement (By.id("card-number_unhappy"));

        //13. Close the iFrame that displays the input card modal
        //Action Comments: Locate th close button on card details modal at the top left hand corner of the card
        driver. findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();

        @AfterTest

        public void. closeBrowser()
        //14.Quit the browser
        //Action: Close Browser
        driver.quit();















        driver.get ()









    }

}
