package modulo7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSpecialOfferTest {

	public static void main(String[] args) {
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localiza��o do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na vari�vel driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Adicionando Implicit Wait de 10 segundos para toda a sess�o
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
		
		// Clicar em See Offer
		WebElement offerButton = driver.findElement(By.id("see_offer_btn"));
		offerButton.click();
		
		// Nome do Produto na aplica��o
		WebElement actualName = driver.findElement(By.cssSelector("#Description > h1"));
		
		// Checar Nome do Produto
		String expectedName = "HP PAVILION 15Z TOUCH LAPTOP";
		String result = (actualName.getText().trim().equals(expectedName)) ? "Passed" : "Failed";
		System.out.println(result);
		
		// Pre�o do Produto na aplica��o
		WebElement actualPrice = driver.findElement(By.cssSelector("#Description > h2"));
		
		// Checar Pre�o do Produto
		String expectedPrice = "$449.99";
		result = (actualPrice.getText().trim().equals(expectedPrice)) ? "Passed" : "Failed";
		System.out.println(result);
		
		
		// Fechar pagina e browser
		driver.close();
		driver.quit();

	}

}
