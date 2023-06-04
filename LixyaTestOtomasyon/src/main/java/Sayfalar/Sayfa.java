package Sayfalar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;

public class Sayfa {
    private final WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void beklemeSuresı(String elemendıd) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elemendıd)));
    }
    public void beklemeSuresıcss(String elemendıd) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elemendıd)));
    }
    public void beklemeSuresıxpath(String elemendıd) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elemendıd)));
    }
    public void tuslama(String elemendId) {
        driver.findElement(By.id(elemendId)).click();
    }
    public void tuslamacss(String elemendId) {
        driver.findElement(By.cssSelector(elemendId)).click();
    }
    public void tuslamaxpath(String elemendId) {
        driver.findElement(By.xpath(elemendId)).click();
    }
    public void alanaYazıYazcc(String elemendId, String yazıId) {
        driver.findElement(By.cssSelector(elemendId)).sendKeys(yazıId);
    }
    public void alanaYazıYaz(String elemendId, String yazıId) {
        driver.findElement(By.id(elemendId)).sendKeys(yazıId);
    }
    public void klavyeTusunaBas(String elemendId, Keys klavyeTusu) {
        driver.findElement(By.cssSelector(elemendId)).sendKeys(klavyeTusu);
    }
}