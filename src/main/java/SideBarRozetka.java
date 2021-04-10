import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBarRozetka extends ParentalSetting {

    SideBarRozetka(WebDriver wdr) {
        super(wdr);
    }


    @FindBy(xpath =  "/html/body/div[4]/div[2]/div/nav/div/div[1]/a/img")
    private WebElement mainLabel;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/nav/div/div[2]/a/b")
    private WebElement telephone;

    public boolean findContactInfo() {
        return mainLabel.isDisplayed() && telephone.isDisplayed();
    }
    public boolean findMainLabel() {
        return mainLabel.isDisplayed();
    }
    public boolean findTelephone() {
        return telephone.isDisplayed();
    }
}
