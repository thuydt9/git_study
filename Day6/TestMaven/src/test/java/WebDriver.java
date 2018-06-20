import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver {
        public static void main (String[] args)
        {
            FirefoxDriver driver = new FirefoxDriver();
            final WebElement element = driver.findElement(By.id(""));
        }


}

