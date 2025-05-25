package co.com.Autokoaj.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FiltroValido extends PageObject {

    public static Target BOTON_Carrito = Target.the("boton para abrir el carrito")
            .located(By.id("shopping_cart"));

    public static Target INFO = Target.the("Informacion del producto")
            .located(By.xpath("//*[@id=\"side_cart_block\"]/div/div/dl/dt"));
}
