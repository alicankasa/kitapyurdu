
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Methods extends Hook{
    private Logger logger= LoggerFactory.getLogger(getClass());

    public void bekle (int saniye) throws InterruptedException {
        Thread.sleep(saniye*1000);
    }

    public void tikla(By element){
        androidDriver.findElement(element).click();
        logger.info(element+" elementine tıklandı");
    }

    public void textYaz(By element, String text){
        androidDriver.findElement(element).sendKeys(text);
        logger.warn(element+" elementine " + text +" yazıldı.");
    }

    public static boolean checkText(By element, String text){
        String alinanDeger = androidDriver.findElement(element).getText();
        if (Objects.equals(alinanDeger, text)){
            return true;
        }
        return false;

    }
    public void clickElement(WebElement element) {
        element.click();
    }

    public void random(By element) {
        List<WebElement> allProducts = androidDriver.findElements(element);

        if (!allProducts.isEmpty()) {
            Random rnd = new Random();
            int randomProductIndex = rnd.nextInt(allProducts.size());
            WebElement randomProduct = allProducts.get(randomProductIndex);


            clickElement(randomProduct);
        } else {
            logger.info("Liste boş, rastgele bir öğe seçilemedi.");
        }
    }


    public static boolean icerikSayfasiKontrol(By element, String text){
        String kitapYurduFiyatTxt= androidDriver.findElement(element).getText();
        if (Objects.equals(kitapYurduFiyatTxt, text)){
            return true;
        }
        return false;
    }

    public void listeKaydet(By element){
        String listedeKaydet= androidDriver.findElement(element).getText();
    }
    public void sepetKaydet(By element){
        String sepetteKaydet= androidDriver.findElement(element).getText();
    }

    public void karsilastirma(By element,By element2){
        String ilk= androidDriver.findElement(element).getText();
        String ikinci= androidDriver.findElement(element2).getText();
        Assert.assertEquals(ilk,ikinci);

    }

}
