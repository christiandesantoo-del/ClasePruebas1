import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistroTest {
    WebDriver driver = null;

    @BeforeEach
    public void setUp(){
        System.out.println("-------EJECUTANDO LA CONFIGURACION--------");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

    }

    @Test
    public void registroExitoso(){
        driver.findElement(By.name("firstName")).sendKeys("agustin");
        driver.findElement(By.name("lastName")).sendKeys("galimberti");
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.name("userName")).sendKeys("agustin@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("calle de prueba");
        driver.findElement(By.name("city")).sendKeys("La Rioja");
        driver.findElement(By.name("postalCode")).sendKeys("5300");
        driver.findElement(By.name("email")).sendKeys("agustin98");
        driver.findElement(By.name("password")).sendKeys("agustin98");
        driver.findElement(By.name("confirmPassword")).sendKeys("agagustin98");
        driver.findElement(By.name("submit")).click();


    }

    @AfterEach
    public void tearDown(){
        driver.quit();
        System.out.println("-------EJECUTANDO EL CIERRE DEL TEST--------");
    }



}
