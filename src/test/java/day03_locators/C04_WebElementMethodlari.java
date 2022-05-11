package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
            1- amazon.com a gidip arama kutusunu locate edin
            2- arama kutusunun tagName inin input oldugunu test edin
            3- arama kutusunun name attribute unun degerinin "field-keywords" oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- amazon.com a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // 2- arama kutusunun tagName inin input oldugunu test edin

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("Tagname testi PASSED");
        } else{
            System.out.println("Tagname testi FAILED");
        }
        // 3- arama kutusunun name attribute unun degerinin "field-keywords" oldugunu test edin

        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attribute testi PASSED");

        } else{
            System.out.println("name attribute testi FAILED");
        }

        System.out.println("aramaKutusu.getLocation() = " + aramaKutusu.getLocation());
        System.out.println("webelement yuksekligi aramaKutusu.getSize().height = " + aramaKutusu.getSize().height);

        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelemtin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelemtin
                                                      istedigim attribute'unun degerini dondurur
         */
    }
}
