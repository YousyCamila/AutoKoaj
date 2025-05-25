package co.com.Autokoaj.questions;


import co.com.Autokoaj.userinterface.FiltroValido;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static jxl.biff.FormatRecord.logger;

public class FiltroVisible implements Question<Boolean> {

    public static FiltroVisible estaPresente() {
        return new FiltroVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            FiltroValido.BOTON_Carrito.resolveFor(actor).click();
            boolean infoVisible = FiltroValido.INFO.resolveFor(actor).isVisible();

            return infoVisible;
        } catch (Exception e) {
            logger.info("No se pudo acceder al carrito o ver la información del producto: " + e.getMessage());
            return false;
        }
    }
}

