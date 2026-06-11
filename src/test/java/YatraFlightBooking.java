import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraFlightBooking {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open Yatra
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Close login popup if displayed
        try {
            driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }

        // Enter From City
        WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromCity.click();
        fromCity.sendKeys("Bangalore");

        Thread.sleep(2000);

        // Enter To City
        WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
        toCity.click();
        toCity.sendKeys("Delhi");

        Thread.sleep(2000);

        // Click Search Button
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();

        Thread.sleep(5000);

        System.out.println("Flight search completed successfully");

        // Do not proceed to payment
        driver.quit();
    }
}
