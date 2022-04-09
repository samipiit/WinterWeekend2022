package learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LearnDriver {

    static String absPath = System.getProperty("user.dir");
    static String chromeDriverRelPath = "\\Drivers\\chromedriver.exe";
    static String geckoDriverRelPath = "\\Drivers\\geckodriver.exe";
    static String chromeDriverPath = absPath + chromeDriverRelPath;
    static String geckoDriverPath = absPath + geckoDriverRelPath;
    static String url = "https://amazon.com/";
    static WebDriver driver;
    static String browser = "firefox";

    public static void main(String[] args) {
        driver = getDriver(browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement searchInputField = driver.findElement(By.id("twotabsearchtextbox"));
        searchInputField.sendKeys("Watches");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        driver.close();
        driver.quit();
    }

    static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", geckoDriverPath);
            driver = new FirefoxDriver();
        }

        return driver;
    }



}
