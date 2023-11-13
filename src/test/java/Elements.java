import org.openqa.selenium.By;

public class Elements {

    static By araButonu = By.id("com.mobisoft.kitapyurdu:id/navigation_search");

    static By aramaInput=By.id("com.mobisoft.kitapyurdu:id/searchEditText");

    static By laterButton= By.id("com.mobisoft.kitapyurdu:id/btnLaterOn");

    static By aramaSonucu= By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/list_content\" and @text=\"harry potter\"]");

    static By sortButton= By.id("com.mobisoft.kitapyurdu:id/sortButton");

    static By mostReviewedBtn= By.xpath("(//android.view.ViewGroup[@resource-id=\"com.mobisoft.kitapyurdu:id/containerView\"])[9]");

    static By randomProduct= By.xpath("(//android.widget.ImageView[@content-desc=\"Ürün görseli\"])[2]");

    static By ayrntSyfKntrol= By.id("com.mobisoft.kitapyurdu:id/textViewUserPrice");
    static By listeFiyatKydt = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewSellPriceBottom\"]");
    static By sepeteEkleBtn= By.id("com.mobisoft.kitapyurdu:id/addToCartNormalView");
    static By kayitGirisYapBtn= By.xpath("//android.widget.RelativeLayout[@content-desc=\"Giriş Yap / Üye Ol\"]");
    static By mailTxtBox= By.id("com.mobisoft.kitapyurdu:id/textview_mail");
    static By sifreTxtBox= By.id("com.mobisoft.kitapyurdu:id/textview_password");
    static By loginButton= By.id("com.mobisoft.kitapyurdu:id/loginButton");

    static By sepetimButonu= By.id("com.mobisoft.kitapyurdu:id/navigation_cart");
    static By books= By.xpath("//android.widget.ImageView[@content-desc=\"Ürün görseli\"]");
    static By sepetFiyatKaydet= By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewTotal\"]");

    static By deleteButton= By.id("com.mobisoft.kitapyurdu:id/buttonDelete");
    static By popUpDeleteButton= By.xpath("//android.widget.RelativeLayout[@content-desc=\"Sil\"]");
    static By bosSepetKontrol= By.id("com.mobisoft.kitapyurdu:id/textViewErrorMessage");
    static By navigationHomePage= By.id("com.mobisoft.kitapyurdu:id/navigation_home");
    static By accountIcon= By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
    static By logoutButton= By.id("com.mobisoft.kitapyurdu:id/ln_logout");
    static By confirmButton= By.id("com.mobisoft.kitapyurdu:id/confirmButton");



}
