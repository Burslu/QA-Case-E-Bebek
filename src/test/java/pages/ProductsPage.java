package pages;

import Utilities.Driver;
import org.openqa.selenium.*;

public class ProductsPage {
    WebDriver ldriver;

    public  void  scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        while (true) {
            try {
                getproduct();
                break;
            } catch (NoSuchElementException e) {
                js.executeScript("window.scrollBy(0,5000)", "");
            }
        }
//    js.executeScript("arguments[0].scrollIntoView();", "//*[text()='Nam Nam 2 li Mama Kaşığı Pembe - Kahverengi']");
    }

    public ProductsPage(WebDriver gdriver) {
        ldriver = gdriver ;
    }

    By product    = By.xpath("//*[text()='Mama Kaşığı 2’li Aqua Green- Mellow Yellow']");
    By addProduct = By.id("addToCartBtn");
    By sawBasket = By.id("btnShowCart");



    public WebElement getproduct(){

        return ldriver.findElement(product);
    }

    public WebElement getAddProduct(){
        return ldriver.findElement(addProduct);
    }

    public WebElement getSawBasket(){
        return ldriver.findElement(sawBasket);
    }


    public void clickProduct(){
        scrollDown();
        getproduct().click();
    }
    public  void  clickAddProduct(){
        getAddProduct().click();
    }

}
