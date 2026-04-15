import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TestGoogle {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        // Open Google
        driver.get("https://www.google.com");
        // Search for Jenkins
        driver.findElement(By.name("q")).sendKeys("Jenkins");
        driver.findElement(By.name("q")).submit();
        // Print title
        System.out.println("Page Title: " + driver.getTitle());
        // Close browser
        driver.quit();
    }
}
