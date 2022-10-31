import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Johanna");

        driver.findElement(By.id("last-name")).sendKeys("Smith");

        driver.findElement(By.id("job-title")).sendKeys("Software Programmer");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-3")).click();

        WebElement selectYearsMenu = driver.findElement(By.id("select-menu"));
        selectYearsMenu.click();

        Select selectMenu = new Select(selectYearsMenu);
        //driver.findElement(By.id("select-menu"));
        selectMenu.selectByIndex(2);

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("11/01/2022");
        datePicker.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();

        driver.quit();
    }
}
