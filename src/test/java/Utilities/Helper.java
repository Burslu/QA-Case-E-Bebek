package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {
//    ProductsPage pro = new ProductsPage(Driver.getDriver());


    public static void waitAndClickButton(WebElement button){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
//    public  void  scrollDown(){
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//      js.executeScript("window.scrollBy(0,750)", "");
//      js.executeScript("arguments[0].scrollIntoView();", "//*[text()='Nam Nam 2 li Mama Kaşığı Pembe - Kahverengi']");
//    }
}
