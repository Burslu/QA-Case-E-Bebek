package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingFinish {
    WebDriver ldriver;

    public ShoppingFinish(WebDriver gdriver){
        ldriver = gdriver;
    }


    By finishShopping = By.id("btnGoToShippingAddress");


    public WebElement getfinishShopping(){
        return ldriver.findElement(finishShopping);
    }

    public void  clickFinishShopping(){
        getfinishShopping().click();
    }
}
