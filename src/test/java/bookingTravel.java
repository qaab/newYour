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

//  brakuje aserrty
        
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

        WebElement departureDay = driver.findElement(By.xpath("//*[@id='flights']/form/div[3]/div/input"));
        departureDay.click();
        driver.findElement(By.xpath("td class='day'>3</td>")).click();

        WebElement arrivalDay = driver.findElement(By.xpath("//*[@id='flights']/form/div[4]/div/input"));
        arrivalDay.click();
        driver.findElement(By.xpath("/html/body/div[16]/div[1]/table/tbody/tr[2]/td[6]")).click();

        WebElement passengersNumber = driver.findElement(By.xpath("//*[@id='flights']/form/div[5]/div/input"));
        passengersNumber.sendKeys("1");

        WebElement searchFligth = driver.findElement(By.xpath("//*[@id='flights']/form/div[6]/button"));
        searchFligth.click();

        WebElement confirmFligth = driver.findElement(By.xpath("//*[@id='bookbtn'] "));
        confirmFligth.click();

    }




    @Test

    public void FillRegistrationFormProfesionallUser(){





    //         driver.findElement(By.id("fos_user_registration_form_name")).sendKeys("Karol");
    WebElement userName = driver.findElement(By.id("name"));
         userName.clear();
         userName.sendKeys("Karol");


    //         driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys("Kowalski");
        WebElement userLastName = driver.findElement(By.id("lastname"));
         userLastName.clear();
         userLastName.sendKeys("Kowalski");


//         driver.findElement(By.id("fos_user_registration_form_email")).sendKeys("Karol@ochkarol.pl");
        WebElement emailField = driver.findElement(By.id("fos_user_registration_form_email"));
        emailField.clear();
        emailField.sendKeys("Karol@ochkarol.pl");

//        driver.findElement(By.id("form_city")).sendKeys("Pińczów");
        WebElement userMobilePhorn = driver.findElement(By.id("mobile"));
        userMobilePhorn.clear();
        userMobilePhorn.sendKeys("0048933333333");


    //         driver.findElement(By.id("form_city")).sendKeys("Pińczów");
         WebElement userAdress = driver.findElement(By.id("adress"));
         userAdress.clear();
         userAdress.sendKeys("Cichy zaulek 3; 00-001 Warszawa");


    //         driver.findElement(By.id("form_street")).sendKeys("Wmagająca");
         WebElement userCountry = driver.findElement(By.id("country"));
         userCountry.clear();
         userCountry.sendKeys("Polska");





//    WebElement femaleRadioButton = driver.findElement(By.cssSelector("input[type='checkbox]"));
//         femaleRadioButton.click();
//    assertTrue(femaleRadioButton.isSelected());
//
//    WebElement registerButton = driver.findElement(By.id("register-submit-btn"));
//         registerButton.click();

    }

    @Test

    public void travelPapers(){

        WebElement bookingConnformation = driver.findElement(By.xpath("//*[@id='body-section']/div/div/div[1]/div/div[1]/div[2]/div[3]/button"));
        bookingConnformation.click();

        WebElement invoiceDownload = driver.findElement(By.id("downloadInvoice"));
        invoiceDownload.click();

        WebElement payDude = driver.findElement(By.xpath("//*[@id='body-section']/div[1]/div[2]/div[2]/center/button[2]"));
        payDude.click();

    }



    @After

    public void tearDown() {
        System.out.println("Test passed");
        driver.quit();
    }
}