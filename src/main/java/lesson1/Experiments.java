//package lesson1;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class Experiments {
//    public static void main(String[] args) {
//        String pathToChromeDriver = "src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdrive.chrome.driver", pathToChromeDriver);
//        String pathToGeckoDriver = "src\\main\\resources\\geckodriver.exe";
//        System.setProperty("webdrive.firefox.driver", pathToGeckoDriver);
//
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--start-maximized");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://test-stand.gb.ru/login");
//        String login = "ftt";
//        String password = "8a15fb6fc7";
//        System.out.println("Page title: " + driver.getTitle());
//        driver.quit();
//    }
//}
