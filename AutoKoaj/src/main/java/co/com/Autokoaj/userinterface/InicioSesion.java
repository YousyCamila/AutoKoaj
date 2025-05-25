package co.com.Autokoaj.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class InicioSesion extends PageObject {

    public static Target IMPUT_CORREO = Target.the ("Colocar el correo para el inicio de sesion")
            .located(By.id("email"));

    public static Target IMPUT_CONTRASEÑA = Target.the("Colocar la contraseña para el inicio de sesion")
            .located(By.id("passwd"));

    public static Target BTN_INICIOSESION = Target.the("Oprimir el boton para iniciar sesion")
            .located(By.id("SubmitLogin"));
}
