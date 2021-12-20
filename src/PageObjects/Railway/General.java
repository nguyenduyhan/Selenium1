package Railway;
import Contants.Constant;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class General {
//    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
//    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
//    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
//
//    protected WebElement getTabLogin(){
//        return Constant.WEBDRIVER.findElement(tabLogin);
//    }
//    protected WebElement getTabLogout(){
//        return Constant.WEBDRIVER.findElement(tabLogout);
//    }
//    protected WebElement getLblWelcomeMessage(){
//        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
//    }
//
//
//    public String getWelcomeMessage(){
//        return this.getLblWelcomeMessage().getText();
//    }
//
//    public LoginPage gotoLoginPage(){
//        this.getTabLogin().click();
//        return new LoginPage();
//    }

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\lggear\\Selenium1\\src\\Excutables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Page/HomePage.cshtml");
    }

}
