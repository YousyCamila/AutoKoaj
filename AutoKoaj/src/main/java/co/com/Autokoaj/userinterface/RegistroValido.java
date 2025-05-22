package co.com.Autokoaj.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroValido {

    public static final Target LINK_MI_CUENTA = Target.the("ícono de usuario que lleva a Mi cuenta")
            .located(By.id("loginsuperior"));
}
