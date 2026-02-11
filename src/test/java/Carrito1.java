import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Carrito1 {
    public static void main(String[] args) {
        // El código a ejecutar comienza aquí
        System.out.println("-----Ejecutar Test Carrito de compra----");
        testAddItem();
    }
    public static void testAddItem(){
        System.out.println("Test: Agregar producto al carrito");
        WebDriver driver = null;
        try{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            WebElement email = driver.findElement(By.id("user-name"));
            email.sendKeys("standard_user");
            WebElement contrasena = driver.findElement(By.id("password"));
            contrasena.sendKeys("secret_sauce");
            WebElement btnSubmit = driver.findElement(By.id("login-button"));
            btnSubmit.click();
            WebElement btnAddToCart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
            btnAddToCart.click();

            WebElement btnGoToCart = driver.findElement(By.className("shopping_cart_container"));
            btnGoToCart.click();
            //driver.quit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

