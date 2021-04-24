import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBarRozetka extends ParentalSetting {

    SideBarRozetka(WebDriver wdr) {
        super(wdr);

    }

    @FindBy(xpath = "//a[@class='side-menu__logo']")
    private WebElement mainLabel;

    @FindBy(xpath = "//span[@class='side-menu__button-icon']/../following-sibling::a")
    private WebElement telephone;

    @FindBy(xpath = "(//a[@href='https://help.rozetka.com.ua/hc/ru'])[2]")
    private WebElement contacts;

/*    public boolean findContactInfo() {
        return mainLabel.isDisplayed() && telephone.isDisplayed();
    }*/

    public ContactInfo followToContacts() {
        contacts.click();
        return new ContactInfo(wdr);
    }

    public WebElement getContacts(){
        return contacts;
    }
    public WebElement getMainLabel(){
        return mainLabel;
    }
    public void setMainLabel (WebElement mainLabel){
        this.mainLabel = mainLabel;
    }
    public WebElement getTelephone(){
        return telephone;
    }
    public void setTelephone (WebElement telephone){
        this.telephone = telephone;
    }
}
