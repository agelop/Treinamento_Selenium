package modulo6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localização do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na variável driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Adicionando Implicit Wait de 10 segundos para toda a sessão
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
	
		// Clicar em Tablets
		WebElement tabletsLink = driver.findElement(By.id("tabletsTxt"));
		tabletsLink.click();
		
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();



	}

}
