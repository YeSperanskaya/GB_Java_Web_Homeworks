//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class GeekBrainsTests {
//    @Test
//    void loginTest() {
//        String pathToChromeDriver = "src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdrive.chrome.driver", pathToChromeDriver);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        driver.get("https://test-stand.gb.ru/login");
//
//        WebElement userNameFiled = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("form#login input[type='text']")));
//        WebElement userPasswordFiled = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("form#login input[type='password']")));
//
//
//        String login = "ftt";
//        String password = "8a15fb6fc7";
//
//        userNameFiled.sendKeys(login);
//        userPasswordFiled.sendKeys(password);
//
//        WebElement loginButton = driver.findElement(By.cssSelector("form#login button"));
//        loginButton.click();
//        wait.until(ExpectedConditions.invisibilityOf(loginButton));
//
//        WebElement userNameLink = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(login)));
//        String actualUsername = userNameLink.getText().replace("\n", " ").trim();
//        Assertions.assertEquals(String.format("Hello, %s", login),
//                actualUsername);
//
//
//        driver.quit();
//    }
//}
