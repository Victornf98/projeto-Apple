package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By campoMac = By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']");
	public By mackBookPro = By.xpath("//li[@class='chapternav-item chapternav-item-macbook-pro']");
	public By comprar = By.cssSelector("p a[href=\"/br/shop/goto/buy_mac/macbook_pro_13\"] ");
	public By modelo = By.xpath("//button[@id='tab-536f1750-a64f-11ed-93b2-0f79c7b467fd-2']");
	public By btnSelecionar = By.xpath("//*[@id=\"panel-536f1750-a64f-11ed-93b2-0f79c7b467fd-2\"]/div/div[2]/div[3]/article/div/div[2]/form/div/button");
    public By validaTexto = By.xpath("//h1[@class='rf-configuration-maintitle typography-headline-reduced']");
}
