import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Runner extends Hook{

    Methods method= new Methods();

    @Test
    public void startTest() throws InterruptedException {

        //ürün arama işlemleri
        method.bekle(10);
        method.tikla(Elements.laterButton);
        method.bekle(10);
        method.tikla(Elements.laterButton);
        method.tikla(Elements.araButonu);
        method.bekle(5);
        method.tikla(Elements.aramaInput);
        method.bekle(5);
        method.textYaz(Elements.aramaInput, "harry potter");
        method.bekle(5);
        method.checkText(Elements.aramaSonucu,"harry potter");
        method.bekle(5);
        method.tikla(Elements.aramaSonucu);
        method.bekle(5);
        method.tikla(Elements.sortButton);
        method.bekle(5);
        method.tikla(Elements.mostReviewedBtn);
        method.bekle(5);
        method.random(Elements.books);
        method.bekle(5);

        //ürün içerik işlemleri
        method.icerikSayfasiKontrol(Elements.ayrntSyfKntrol,"Kitapyurdu Fiyatı:");
        method.bekle(5);
        method.listeKaydet(Elements.listeFiyatKydt);
        method.bekle(5);
        method.tikla(Elements.sepeteEkleBtn);
        method.bekle(5);

        //login işlemleri
        method.tikla(Elements.kayitGirisYapBtn);
        method.bekle(5);
        method.textYaz(Elements.mailTxtBox,"alicancagan35@gmail.com");
        method.bekle(5);
        method.textYaz(Elements.sifreTxtBox,"denemealicandeneme");
        method.bekle(5);
        method.tikla(Elements.loginButton);
        method.bekle(5);

        //sepet işlemleri
        method.tikla(Elements.sepetimButonu);
        method.bekle(5);
        method.sepetKaydet(Elements.sepetFiyatKaydet);
        method.bekle(10);
        //method.karsilastirma(Elements.listeFiyatKydt,Elements.sepetFiyatKaydet);
        //method.bekle(10);
        method.tikla(Elements.deleteButton);
        method.bekle(2);
        method.tikla(Elements.popUpDeleteButton);
        method.bekle(7);
        method.checkText(Elements.bosSepetKontrol,"Sepetiniz boş!");
        method.bekle(5);

        //logout işlemleri
        method.tikla(Elements.navigationHomePage);
        method.bekle(3);
        method.tikla(Elements.accountIcon);
        method.bekle(3);
        method.tikla(Elements.logoutButton);
        method.bekle(5);
        method.tikla(Elements.confirmButton);
        method.bekle(3);











    }
}
