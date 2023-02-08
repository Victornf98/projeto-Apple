package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver.Driver;

public class Metodos extends Driver {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(300)");
	}

	public void pausa(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println("O texto capturado " + textoCapturado);
		assertEquals(textoEsperado, textoCapturado);
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void currentUrl(String urlDesejada) {
		assertEquals(urlDesejada, driver.getCurrentUrl());
	}

	public void moverMouse(By elemento) {

		WebElement hoverable = driver.findElement(By.id(""));
		new Actions(driver).moveToElement(hoverable).perform();
	}
}