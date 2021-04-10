import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageRozetka extends ParentalSetting {

    MainPageRozetka(WebDriver wdr) {
        super(wdr);
    }

    //@FindBy(xpath = "/html/body/app-root/div/div[1]/rz-header/header/div/div/rz-mobile-user-menu/button")
    //private WebElement buttonMenu;


    public SideBarRozetka openSideBar() throws InterruptedException {
        WebElement buttonMenu = wdr.findElement(new By.ByXPath("/html/body/app-root/div/div[1]/rz-header/header/div/div/rz-mobile-user-menu/button"));
        wait(1500);
        buttonMenu.click();
        wait(1500);
        return new SideBarRozetka(wdr);
    }

    public boolean findButtonMenu() throws InterruptedException {
        wait(2500);
        WebElement buttonMenu = wdr.findElement(new By.ByXPath("/html/body/app-root/div/div[1]/rz-header/header/div/div/rz-mobile-user-menu/button"));
        return buttonMenu.isDisplayed();
    }

}
