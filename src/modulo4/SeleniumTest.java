package modulo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws Exception {
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localização do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na variável driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
		// Sleep de 5 segundos adicionados
		Thread.sleep(5000);
		
		// Clicar em Tablets
		WebElement tabletsLink = driver.findElement(By.id("tabletsTxt"));
		tabletsLink.click();
		
		// Sleep de 5 segundos adicionados
		Thread.sleep(5000);
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();


	}

}
