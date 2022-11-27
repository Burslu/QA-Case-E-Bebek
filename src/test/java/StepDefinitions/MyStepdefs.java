package StepDefinitions;

import pages.HomePage;
import pages.ProductsPage;
import pages.ShoppingFinish;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStepdefs {

   HomePage hp = new HomePage(Driver.getDriver());
   ProductsPage pro = new ProductsPage(Driver.getDriver());
   ShoppingFinish shop = new ShoppingFinish(Driver.getDriver());
   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

 @When("https:e-bebek sitesi açılır.")
    public void https_e_bebek_sitesi_açılır() {
    Driver.getDriver().get("https://www.e-bebek.com");
    System.out.println("e-bebek sayfasina gidildi");
 }
    @Given("Arama çubuğuna {string} yazılır")
    public void arama_çubuğuna_yazılır(String search) throws InterruptedException {
      hp.searchBox(search);
       System.out.println("arama cubuguna kasik mamasi yazildi");
    }
    @Given("arama sonucunda gelen sonuçlardan en son ürün açılır.")
    public void arama_sonucunda_gelen_sonuçlardan_en_son_ürün_açılır() throws InterruptedException {
     pro.clickProduct();
     Thread.sleep(2000);
     Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.e-bebek.com/oioi-mama-kasigi-2li-aqua-green--mellow-yellow-p-oioi-1060016");
       System.out.println("arama sonucu olarak son urun bulunup assertion yapildi");
    }
    @Then("Ürün sepete eklenir.")
    public void ürün_sepete_eklenir() {
     pro.clickAddProduct();
       System.out.println("urun sepete eklendi");
    }
    @Then("Sağdan açılan modadan sepeti gör butonuna tıklanır.")
    public void sağdan_açılan_modadan_sepeti_gör_butonuna_tıklanır() {
    pro.getSawBasket().click();
       System.out.println("sepeti gor butonuna basildi");
    }
    @Then("Alışverişi tamamla butonuna tıklanır.Üye girişi ekranının açıldığı doğrulanır.")
    public void alışverişi_tamamla_butonuna_tıklanır_üye_girişi_ekranının_açıldığı_doğrulanır(){
    shop.clickFinishShopping();
    wait.until(ExpectedConditions.urlToBe("https://www.e-bebek.com/login?forced=true"));
    Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.e-bebek.com/login?forced=true");
       System.out.println("alisveris tamamla butonuna basildi ve assertion yapildi");
    }
}
