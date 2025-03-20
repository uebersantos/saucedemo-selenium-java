package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest {
    private WebDriver driver;

    @BeforeAll
    void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void beforeEach() {
        WebDriverManager.chromedriver()
                .driverVersion("134.0.6998.90")
                .setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testLoginComSucesso() {
        driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();

        // Verifica se a URL após o login é a esperada
        String expectedUrl = "https://www.saucedemo.com/v1/inventory.html";
        assertEquals(expectedUrl, driver.getCurrentUrl(), "URL incorreta após login!");
    }

    @Test
    void testLoginComCredenciaisInvalidas() {
        driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("usuario_invalido");
        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("senha_invalida");
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();

        // Verifica se a mensagem de erro está presente
        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error'][contains(.,'Epic sadface: Username and password do not match any user in this service')]"));
        assertTrue(errorMsg.isDisplayed(), "Mensagem de erro não exibida!");
    }

    @Test
    void testLoginSemPreencherCampos() {
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();

        // Verifica se a mensagem de erro está presente
        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error'][contains(.,'Epic sadface: Username is required')]"));
        assertTrue(errorMsg.isDisplayed(), "Mensagem de erro não exibida!");
    }
}
