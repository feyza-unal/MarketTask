package Pages;

import Base.BaseStepMethod;
import static Base.BaseTest.driver;

public class MainPage extends BaseStepMethod {

    public void go_To_Url(String url){
        driver.get(url);
    }
}
