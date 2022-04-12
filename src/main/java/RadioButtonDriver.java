import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonDriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/10685257/IdeaProjects/Learning/src/main/WebApp/Radio.html");
        List<WebElement> radioButtonList = (List<WebElement>) driver.findElements(By.name("color"));
        radioButtonList.get(2).click();

        for(WebElement radioButton : radioButtonList){
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}
