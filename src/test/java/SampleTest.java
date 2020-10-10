import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class SampleTest extends BaseTest {

    @Test
    public void HomepageTest(){
        assertEquals("Üye Girişi - GittiGidiyor", getTitle());
    }

    @Test
    public void logIn(){
        sendById("L-UserNameField", "tsardogan91@gmail.com");
        sendById("L-PasswordField", "Tolga1234");
        clickById("gg-login-enter");

    }
    public void searchItem() throws InterruptedException {
        sendByDataCy("header-search-input", "Telefon");
        clickByDataCy("search-find-button");
        Thread.sleep(3000);

    }
    public void chooseItem() throws InterruptedException{
        clickById("item-info-block-587493451");
        clickById("add-to-basket");
    }
    public void basket() throws InterruptedException{
        callHomePage();
        assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",getTitle());
        clickByDataCy("header-cart-menu");
        clickById("cart-continue-button-container");
    }

    public void filladressform() throws InterruptedException{
        assertEquals("GittiGidiyor - Adres bilgilerim", getTitle());
        sendByxPath("AddressName","Ev");
        sendByxPath("Name","Tolga");
        sendByxPath("SurName","Sardogan");
        sendById("City", "İstanbul");
        sendById("District","Kadıköy");
        sendById("Neighborhood","Dumlupınar Mah.");
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Baysas 216 C blok No:99");
        sendByxPath("phone-number","5446782122");
        clickById("post-address-form");

    }


}
