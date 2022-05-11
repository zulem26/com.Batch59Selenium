package day01_seleniumProje;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class C01_IlkClass {
    public static void main(String[] args) {
        /* En ilkel hali ile bir otomasyon yapmak icin Class imiza otomasyon icin gerekli olan
        webdriver in yerini gostermemiz gerekir bunun icin java kutuphanesinden System.setProperty()
        methodu kulllaniriz

        method 2 parametre istemektedir
        ilki kullanacagimiz driver : webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu :
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.techproeducation.com");
    }


}
