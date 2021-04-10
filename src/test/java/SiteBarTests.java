import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class SiteBarTests {

    MainPageRozetka mainPageRozetka = new MainPageRozetka(new ChromeDriver());


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver" , "../chromedriver.exe");
    }

    @Test
    public void checkThatSideBarContainsContactInformations() throws InterruptedException {
        Assert.assertTrue(mainPageRozetka.openSideBar().findContactInfo());
    }
    @Test
    public void checkThatSideBarLogo() throws InterruptedException {
        Assert.assertTrue(mainPageRozetka.openSideBar().findMainLabel());
    }
    @Test
    public void checkThatSideBarTelephone() throws InterruptedException {
        Assert.assertTrue(mainPageRozetka.openSideBar().findTelephone());
    }
    @Test
    public void checkThatButtonMenuInMainPage() throws InterruptedException {
        Assert.assertTrue(mainPageRozetka.findButtonMenu());
    }


}
