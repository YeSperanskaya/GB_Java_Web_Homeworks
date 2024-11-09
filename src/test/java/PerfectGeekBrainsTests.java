//import org.junit.jupiter.api.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class PerfectGeekBrainsTests {
//    private WebDriver driver;
//    private WebDriverWait wait;
//    private static String USERNAME;
//    private static String PASSWORD;
//
//    @BeforeAll
//    public static void setupClass() {
//        System.setProperty("webdrive.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//        USERNAME = "ftt";
//        PASSWORD = "8a15fb6fc7";
//    }
//
//    @BeforeEach
//    public void setupTest() {
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void testStandGeekBrains() {
//        driver.get("https://test-stand.gb.ru/login");
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("form#login input[type='text']"))).sendKeys(USERNAME);
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector("form#login input[type='password']"))).sendKeys(PASSWORD);
//
//
//
//
//        WebElement loginButton = driver.findElement(By.cssSelector("form#login button"));
//        loginButton.click();
//
//        WebElement userNameLink = driver.findElement(
//                By.partialLinkText(USERNAME));
//        String actualUsername = userNameLink.getText().replace("\n", " ").trim();
//        Assertions.assertEquals(String.format("Hello, %s", USERNAME),
//                actualUsername);
//    }
//    @AfterEach
//    public void teardown(){
//        driver.quit();
//
//    }
//    //22-14
//
//}
