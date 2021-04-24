import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class ParentalSetting {//extends LoadableComponent<ParentalSetting> {

    WebDriver wdr;
    //private WebDriverWait wait;


    ParentalSetting(WebDriver wdr){

        this.wdr = wdr;
        PageFactory.initElements(wdr, this);
        wdr.manage().window().maximize();
        //this.wait = new WebDriverWait(wdr, 10);
        wdr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void exit(){
        wdr.quit();
    }

    public void reloadAnyPage(){
        wdr.navigate().refresh();
    }

   /* @Override
    protected void load() {
        this.wdr.get("https://www.rozetka.com.ua");
    }

    @Override
    protected void isLoaded() throws Error {
        assertTrue("Page is not loaded!", wdr.getCurrentUrl().contains("https://www.rozetka.com.ua"));
    }*/


}
