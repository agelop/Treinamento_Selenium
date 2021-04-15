package modulo7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoggedUserTest {

	public static void main(String[] args) {
		
		// Seta a variavel webdriver.chrome.driver do sistema para a localização do Driver do Chrome que foi baixado
		// Instancia o Driver do Chrome na variável driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aldog\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		// Instanciando um objeto do tipo WebDriverWait para configurar Explicit Waits nos elementos
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Navega para o Advantage Online Shopping
		driver.get("https://www.advantageonlineshopping.com/");
		
        //Waiting Page To Fully Load - Wait Explicito
        wait.until(ExpectedConditions.attributeToBe(By.className("loader"),"style", "display: none; opacity: 0;"));
        
        //SignIn to Advantage - Click User Icon
        WebElement userButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefUserIcon")));
        userButton1.click();

        //Enter User Name
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameField.sendKeys("Mercury");

        //Enter Password
        WebElement passwdField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwdField.sendKeys("Mercury");

        //Click SignIn Button
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));
        signInButton.click();

  
        //Waiting Page to Refresh
        wait.until(ExpectedConditions.attributeToBe(By.className("PopUp"),"style", "display: none;"));

        //Verify Logged USer on the Page
        WebElement loggedUserMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menuUserLink\"]/span")));
        String loggedUser = loggedUserMenu.getText();
		String result = (loggedUser.equals("Mercury")) ? "Passed" : "Failed";
		System.out.println(result);

        //Sign out User
        WebElement userButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefUserIcon")));
        userButton2.click();

        //Click Signout Menu
        WebElement signoutMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginMiniTitle\"]/label[3]")));
        signoutMenu.click();
        
		// Fechar pagina e browser
		driver.close();
		driver.quit();
		
	}

}
