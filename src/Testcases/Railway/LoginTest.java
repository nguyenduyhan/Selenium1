//package Railway;
//import Common.Utilities;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.*;
//import Contants.Constant;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//
//public class LoginTest {
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("Pre-condition");
//        System.setProperty("webdriver.chrome.driver", "D:\\lggear\\Selenium1\\src\\Excutables\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.railway.somee.com/Page/HomePage.cshtml");
//    }
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("Post-condition");
//        Constant.WEBDRIVER.quit();
//    }
//
//    @Test
//    public void TC001(){
//        System.out.println("TC001 - User can login");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = homePage.gotoLoginPage();
//
//        String actualMsg = loginPage.login(Constant.USERNAME, Constant.PASSWORD).getWelcomeMessage();
//        String expectedMsg = "Welcome" + Constant.USERNAME;
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Message");
//    }
//}
