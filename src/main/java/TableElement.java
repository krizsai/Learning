import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/10685257/IdeaProjects/Learning/src/main/WebApp/TableElement.html");

        /*WebElement outerTabElement = driver.findElement(By.tagName("table"));
        WebElement innerTabElement = outerTabElement.findElement(By.tagName("table"));
        WebElement row = innerTabElement.findElements(By.tagName("td")).get(1);*/

        WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
        System.out.println(row.getText());
    }
}
