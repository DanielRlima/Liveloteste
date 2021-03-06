package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosLivelo {

	WebDriver driver;

	public void abrirNavegador(String urlApp) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(urlApp);
		driver.manage().window().maximize();

	}

	public void clicar(By elementos) {
		driver.findElement(elementos).click();
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);

	}

	public void esperaImplicita() {
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

	}

	public void preencher(By elementos, String texto) {
		driver.findElement(elementos).sendKeys(texto);

	}


	 public void validarTexto(By elementos, String txtEsperado) { 
		 String texto = driver.findElement(elementos).getText(); 
		 System.out.println("**********validar pontos:********** " + texto);
		 assertEquals(txtEsperado, texto);
	 
	 }
	 

	public void fecharNavegador() {
		driver.quit();

	}

}
