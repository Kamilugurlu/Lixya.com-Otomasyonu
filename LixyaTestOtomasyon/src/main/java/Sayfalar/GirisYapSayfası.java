package Sayfalar;
import org.openqa.selenium.WebDriver;

public class GirisYapSayfası  extends Sayfa{
    public GirisYapSayfası(WebDriver driver) {
        super(driver);
    }
    public final String email= "[ng-model='login.gsmBox']";
    public final String password = "[ng-model='login.sifreBox']";
    public final String girisYapTusu = ".btn-login";

    public void bekleme (){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
