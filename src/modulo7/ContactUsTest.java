package modulo7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsTest {

	public static void main(String[] args) {
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localização do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na variável driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Instanciando um objeto do tipo WebDriverWait para configurar Explicit Waits nos elementos
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
		// Maximizar janela do browser para mostrar menu
		driver.manage().window().maximize();
		
        //Waiting Page To Fully Load - Wait Explicito
        wait.until(ExpectedConditions.attributeToBe(By.className("loader"),"style", "display: none; opacity: 0;"));
		
		// Click Contact Us Menu 
		WebElement contactMenu = driver.findElement(By.linkText("CONTACT US"));
		contactMenu.click();

		// Select Tablet
		WebElement productList = driver.findElement(By.name("categoryListboxContactUs"));
		Select productSelect = new Select(productList);
		productSelect.selectByVisibleText("Tablets");
		
		// Enter Email
		WebElement emailField = driver.findElement(By.name("emailContactUs"));
		emailField.sendKeys("user1@server.com");
		
		// Enter Subject
		WebElement subjectField = driver.findElement(By.name("subjectTextareaContactUs"));
		subjectField.sendKeys("Problemas com o Tablet...");
		
		// Click Send
		WebElement sendButton = driver.findElement(By.id("send_btnundefined"));
		sendButton.click();
		
		// Mensagem de Sucesso - Wait Explícito
		WebElement actualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#registerSuccessCover > div > p")));
		
		// Checar Mensagem
		String expectedMessage = "Thank you for contacting Advantage support.";
		String result = (actualMessage.getText().trim().equals(expectedMessage)) ? "Passed" : "Failed";
		System.out.println(result);
		
				
		// Fechar pagina e browser
		driver.close();
		driver.quit();

	}

}
