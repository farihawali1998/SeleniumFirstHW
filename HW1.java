package SeleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String URL=driver.getCurrentUrl();

        System.out.println(URL);

        driver.quit();
    }
}
