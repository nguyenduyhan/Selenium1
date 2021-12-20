package Railway;

import Contants.Constant;

public class HomePage extends General {
    public HomePage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
