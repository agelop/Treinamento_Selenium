package modulo8;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotTest {

	public static void main(String[] args) throws Exception {

		// Seta a variavel webdriver.chrome.driver do sistema para a localização do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na variável driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
		// Sleep 10 segundos
	    Thread.sleep(10000);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("./image.png"));
	
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();

	}

}
