import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class RegisterTest {

    public void validRegisterTest() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Vlad");
        driver.findElement(By.id("lastname")).sendKeys("Nedisan");
        driver.findElement(By.id("email_address")).sendKeys("vladnedisan" + randomInt + "@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("1234567");
        driver.findElement(By.id("confirmation")).sendKeys("1234567");
        driver.findElement(By.cssSelector(" #form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        //driver.quit();
    }

    public static void main(String[] args) {
        RegisterTest registerTest = new RegisterTest();
        registerTest.validRegisterTest();
    }
}
