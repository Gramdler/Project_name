import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactInfo extends ParentalSetting {

    public ContactInfo(WebDriver wdr){
        super(wdr);
    }

    private List<WebElement> listHelpsLinks = wdr
            .findElements(By.xpath("//ul[@class='main-category__list]/li"));

    public boolean checkThatAtLeastOneOfHelpLinksContainHelp(){
        for (WebElement listHelpsLink :listHelpsLinks){

            if (listHelpsLink.getText().substring(0,16).equalsIgnoreCase("Помощь по заказу")) {
                return true;
            }
        }
        return  false;
    }
}
