import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItem {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("file:///C:/Users/10685257/IdeaProjects/Learning/src/main/WebApp/SelectElement.html");

        WebElement selectElement = Driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");
    }
}
