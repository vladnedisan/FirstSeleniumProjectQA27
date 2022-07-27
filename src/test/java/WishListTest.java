import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    public void validWishlistAdd() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("vlad.nedisan@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > ul > li:nth-child(1)")).click();
    }

    public static void main(String[] args) {
        WishListTest wishListTest = new WishListTest();
        wishListTest.validWishlistAdd();
    }
}
