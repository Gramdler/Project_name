import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SiteBarTests {

    MainPageRozetka mainPageRozetka = new MainPageRozetka(new ChromeDriver());
    SideBarRozetka sb;
    ContactInfo cf;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
    }

    @Before
    public void openApplicationBeforeTests() throws InterruptedException{
        mainPageRozetka.openMainPage();
    }

    @After
    public void closeApplicationAfterTest(){
        mainPageRozetka.ext();
    }

    @Test
    public void checkThatSideBarContainsContactInformations() throws InterruptedException{
        sb = mainPageRozetka.openSideBar();
        Assert.assertTrue(sb.getMainLabel().isDisplayed()&&sb.getTelephone().isDisplayed());
    }

    @Test
    public void checkHelpLinks() throws InterruptedException {
        cf = mainPageRozetka.openSideBar().followToContacts();
        Assert.assertTrue(cf.checkThatAtLeastOneOfHelpLinksContainHelp());
    }



}
