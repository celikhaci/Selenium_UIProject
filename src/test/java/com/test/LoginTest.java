
package com.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;


public class LoginTest {

    protected WebDriver driver;

    @Before
    public  void setUp() throws Exception{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hacic\\IdeaProjects\\TestUygulaması\\TestUygulaması\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @Test
            public void LoginTest() throws InterruptedException {

        driver.get("https://www.instagram.com/");
        sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("barbaroshaci");
        sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("*********");
        sleep(2000);
        driver.findElement(By.cssSelector(".sqdOP.L3NKy.y3zKF")).click();
        sleep(2000);

        driver.findElement(By.cssSelector(".sqdOP.yWX7d.y3zKF")).click();
        sleep(2000);
        driver.findElement(By.cssSelector(".aOOlW.HoLwm")).click();
        sleep(1000);
        driver.findElement(By.cssSelector(".gmFkV")).click(); //Profile Gir
        sleep(2000);

        driver.findElement(By.xpath("//a[@href='/p/CA0jLjEDSz-/']")).click(); // İlk Gönderiye gir
        sleep(2000);

        driver.findElement(By.xpath("//button[@class='  _6CZji   ']")).click(); // Fotolar arasında geçiş yap
        sleep(2000);

        driver.findElement(By.className("button.wpO6b  ")).click(); // Gönderiyi Kapat
        sleep(1000);

        driver.findElement(By.xpath("//button[@class='wpO6b  ']")).click(); // Ayarlar sekmesine gir
        sleep(2000);

        driver.findElement(By.xpath("//button[.='Çıkış Yap']")).click(); // Çıkış yap
        sleep(2000);



    }
@After
    public void tearDown() throws Exception{
        driver.quit();
}



}
