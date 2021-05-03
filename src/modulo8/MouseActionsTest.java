package modulo8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws Exception {
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localiza��o do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na vari�vel driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Adicionando Implicit Wait de 10 segundos para toda a sess�o
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
		// Sleep 10 segundos
	    Thread.sleep(10000);
		
	    // Carrinho
	    WebElement carrinho = driver.findElement(By.id("menuCart"));
	    Actions action = new Actions(driver);

	    
	    // Move mouse para o carrinho
	    action.moveToElement(carrinho).build().perform();
		
		// Sleep 10 segundos
	    Thread.sleep(10000);
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();

	}

}
