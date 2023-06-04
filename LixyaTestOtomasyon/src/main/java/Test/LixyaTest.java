package Test;


import Sayfalar.AnaSayfa;
import Sayfalar.AramaButonları;
import Sayfalar.GirisYapSayfası;
import Sayfalar.Sayfa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LixyaTest {
    WebDriver driver;
    private AnaSayfa anasayfa;
    private Sayfa sayfa;
    private GirisYapSayfası girisYapSayfası;
    private AramaButonları aramaButonları;
    String url = "https://www.lixya.com/";


    @BeforeEach
    void setup()throws InterruptedException {
        driver = new ChromeDriver();
        anasayfa = new AnaSayfa(driver);
        sayfa = new Sayfa(driver);
        aramaButonları = new AramaButonları(driver);
        girisYapSayfası = new GirisYapSayfası(driver);
        driver.manage().window().maximize();
        Thread.sleep(60000);
    }

    @Test
    void Login() {

        driver.get("https://www.lixya.com/");

        sayfa.beklemeSuresıcss(anasayfa.girisButnonu);
        sayfa.tuslamacss(anasayfa.girisButnonu);


        sayfa.beklemeSuresıcss(girisYapSayfası.email);
        sayfa.tuslamacss(girisYapSayfası.email);
        sayfa.alanaYazıYazcc(girisYapSayfası.email, "kamilugrl28@gmail.com");

        sayfa.beklemeSuresıcss(girisYapSayfası.password);
        sayfa.tuslamacss(girisYapSayfası.password);
        sayfa.alanaYazıYazcc(girisYapSayfası.password, "6253 ");

        sayfa.beklemeSuresıcss(girisYapSayfası.girisYapTusu);
        sayfa.tuslamacss(girisYapSayfası.girisYapTusu);

        girisYapSayfası.bekleme();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        for (int i = 0; i < 4; i++) {
            jsExecutor.executeScript("window.open('" + url + "', '_blank');");
        }

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windowHandles);
        String[] urunler ={"Dafoni Hummer Samsung Galaxy Note 8 Ultra Koruma Silikon Kenarlı Şeffaf Kılıf",
                "Samsung Galaxy S21 Fe 5G Sweety Cats Kılıf",
                "Xiaomi Redmi Note 11 Pro Rose Gold Zincirli Kılıf",
                "Dafoni Glossy İphone 11 Colorful Pattern Kılıf",
                "Dafoni Hologram Samsung Galaxy Note 8 Deer Kılıf"};

        // Sayfaları dögüye alarak ilk işlemleri kısa sürede yapmak için.
        for (int i = 0; i < windowList.size(); i++) {
            String windowHandle = windowList.get(i);
            driver.switchTo().window(windowHandle);
            String urun= urunler[i];


                sayfa.beklemeSuresı(anasayfa.src );
                sayfa.tuslama( anasayfa.src );
                sayfa.alanaYazıYaz(anasayfa.src, urun);

                sayfa.beklemeSuresıcss(anasayfa.srcButton);
                sayfa.tuslamacss(anasayfa.srcButton);

                // Sayfalar arası test yapmak için.
            if (i == 0) {
                sayfa.tuslamacss(aramaButonları.buton1);
                sayfa.beklemeSuresıcss(aramaButonları.sepeteEkle);
                sayfa.tuslamacss(aramaButonları.sepeteEkle);
                girisYapSayfası.bekleme();
            } else if (i == 1) {
                sayfa.tuslamacss(aramaButonları.buton2);
                sayfa.beklemeSuresıcss(aramaButonları.sepeteEkle);
                sayfa.tuslamacss(aramaButonları.sepeteEkle);
                girisYapSayfası.bekleme();
            } else if (i == 2) {
                sayfa.tuslamacss(aramaButonları.buton3);
                sayfa.beklemeSuresıcss(aramaButonları.sepeteEkle);
                sayfa.tuslamacss(aramaButonları.sepeteEkle);
                girisYapSayfası.bekleme();
            } else if (i == 3) {
                sayfa.tuslamacss(aramaButonları.buton4);
                sayfa.beklemeSuresıcss(aramaButonları.sepeteEkle);
                sayfa.tuslamacss(aramaButonları.sepeteEkle);
                girisYapSayfası.bekleme();
            } else if (i == 4) {
                sayfa.tuslamacss(aramaButonları.buton5);
                sayfa.beklemeSuresıcss(aramaButonları.sepeteEkle);
                sayfa.tuslamacss(aramaButonları.sepeteEkle);
                girisYapSayfası.bekleme();
            }
        }
    }
}
