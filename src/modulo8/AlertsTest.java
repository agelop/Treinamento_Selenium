package modulo8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsTest {

	public static void main(String[] args) throws Exception {

		// Seta a variavel webdriver.chrome.driver do sistema para a localização do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na variável driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Instanciando um objeto do tipo WebDriverWait para configurar Explicit Waits nos elementos
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// Navega para o Advantage Online Shopping
		driver.get("https://www.selenium.dev/documentation/en/webdriver/js_alerts_prompts_and_confirmations/");
		
		//Click the link to activate the alert
		driver.findElement(By.linkText("See an example alert")).click();

		//Wait for the alert to be displayed and store it in a variable
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Sleep 10 segundos
	    Thread.sleep(5000);

		//Press the OK button
		alert.accept();
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();

	}

}
