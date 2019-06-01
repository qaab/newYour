import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookingTravel {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.phptravels.net/");


    }

    @Test

    public void selectFlights(){

        WebElement flights = driver.findElement(By.xpath("//*[@id='s2id_autogen3']/a/span[1]"));
        flights.click();

        WebElement airportFrom = driver.findElement(By.xpath("//*[@id='s2id_location_from']/a/span[1]"));
        airportFrom.sendKeys("waw");
        driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]/div")).click();


//        driver.findElement(By.xpath("//span[text()='Flights']")).click();
        WebElement airportTo = driver.findElement(By.xpath("//*[@id='s2id_location_to']/a/span[1]"));
        airportTo.sendKeys("New York");
        driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]/div")).click();

        



    }





    @After

    public void tearDown() {
        System.out.println("Test passed");
        driver.quit();
    }
}