package test;

import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // Navigate to the GitHub Pages site
        driver.get("https://rambharath777.github.io/Testing/");
    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
