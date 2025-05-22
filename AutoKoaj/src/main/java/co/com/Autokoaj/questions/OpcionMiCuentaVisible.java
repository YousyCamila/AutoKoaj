package co.com.Autokoaj.questions;

import co.com.Autokoaj.userinterface.RegistroValido;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static jxl.biff.FormatRecord.logger;

public class OpcionMiCuentaVisible implements Question<Boolean> {

    public static OpcionMiCuentaVisible estaPresente() {
        return new OpcionMiCuentaVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            boolean visible = RegistroValido.LINK_MI_CUENTA.resolveFor(actor).isVisible();
            String href = RegistroValido.LINK_MI_CUENTA.resolveFor(actor).getAttribute("href");
            return visible && href.contains("mi-cuenta");
        } catch (Exception e) {
            logger.info("No encontró el enlace 'Mi cuenta' o hubo otro error: " + e.getMessage());
            return false;
        }
    }
}
