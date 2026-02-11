import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LoginTest2 {
    public static void main(String[] args) {
        // El código a ejecutar comienza aquí
        System.out.println("-----Ejecutar Test Login----");
        testloginexitoso();
    }
    public static void testloginexitoso(){
        System.out.println("Test: Login Exitoso");
        WebDriver driver = null;
        try{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");


            WebElement email = driver.findElement(By.id("user-name"));
            email.sendKeys("standard_user");
            WebElement contraseña = driver.findElement(By.id("password"));
            contraseña.sendKeys("secret_sauce");
            WebElement btnSubmit = driver.findElement(By.id("login-button"));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
