import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageRozetka extends ParentalSetting {

    MainPageRozetka(WebDriver wdr) {
        super(wdr);
    }

    @FindBy(xpath = "//button[@class='header__button' and @aria-label='Открыть меню']")
    private WebElement buttonMenu;

    public MainPageRozetka openMainPage() throws InterruptedException {
        wdr.get("https://www.rozetka.com.ua"); // open main page rozetka
        //Thread.sleep(3000);
        return this;
    }

    public SideBarRozetka openSideBar() throws InterruptedException {
        buttonMenu.click();
        //Thread.sleep(3000);
        //new WebDriverWait(wdr, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='side-menu__logo']")));
        new WebDriverWait(wdr, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='side-menu__logo']")));
        new WebDriverWait(wdr, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='side-menu__logo']")));
        return new SideBarRozetka(wdr);
    }

    public void ext(){
        exit();
    }



}
