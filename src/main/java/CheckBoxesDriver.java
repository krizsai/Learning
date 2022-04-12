import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesDriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/10685257/IdeaProjects/Learning/src/main/WebApp/CheckBox.html");
        WebElement checkOne = driver.findElement(By.id("red"));
        checkOne.click();
        /*List<WebElement> checkList = driver.findElements(By.id("id"));

        for( WebElement checkItem : checkList){
            if(checkItem.getAttribute("value").toLowerCase() == "red"){
                checkItem.click();
            }else if(checkItem.getAttribute("value").toLowerCase() == "orange"){
                checkItem.click();
            }
        }*/
    }
}
