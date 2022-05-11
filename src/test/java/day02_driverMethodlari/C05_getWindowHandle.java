package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());

        //CDwindow-550D0B272FB956E0464566B6916101C9 benzersiz olarak acilan window a ait hashcode unu verir


    }
}
