package modulo7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPriceTest2 {

	public static void main(String[] args) {

		
		// Seta a variavel webdriver.chrome.driver do sistema para a localiza��o do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na vari�vel driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Adicionando Implicit Wait de 10 segundos para toda a sess�o
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
		
		// Clicar no Segmento de TABLETS
		WebElement segmentLink = driver.findElement(By.xpath("//*[.=\"TABLETS\"]"));
		segmentLink.click();
		
		// Clicar no Bot�o BUY NOW
		WebElement buyButton = driver.findElement(By.linkText("BUY NOW"));
		buyButton.click();
		
		// Pre�o do Produto na aplica��o
		WebElement actualPrice = driver.findElement(By.cssSelector("#Description > h2"));
		
		// Checar Pre�o do Produto
		String expectedPrice = "$1,009.00";
		String result = (actualPrice.getText().trim().equals(expectedPrice)) ? "Passed" : "Failed";
		System.out.println(result);
		
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();

	}

}
