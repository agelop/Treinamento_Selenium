package modulo6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localiza��o do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na vari�vel driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Instanciando um objeto do tipo WebDriverWait para configurar Explicit Waits nos elementos
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
	
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
	
		// Clicar em Tablets - Esperando a condi��o do elemento estar clic�vel
		WebElement tabletsLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("tabletsTxt")));
		tabletsLink.click();
		
				
		// Fechar pagina e browser
		driver.close();
		driver.quit();



	}

}
