package pages;

import Utilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver ldriver;
    Helper help = new Helper();

    public HomePage(WebDriver gdriver) {

        ldriver = gdriver ;
    }

    By txtSearchBox = By.id("txtSearchBox");

    private WebElement gettxtSearchBox(){
        return ldriver.findElement(txtSearchBox);
    }
    public void searchBox(String searchWord) throws InterruptedException {
        gettxtSearchBox().sendKeys(searchWord + Keys.ENTER);
        Thread.sleep(1000);

    }





}
