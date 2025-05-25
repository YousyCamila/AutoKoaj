package co.com.Autokoaj.stepsdefinitions;

import co.com.Autokoaj.questions.FiltroVisible;
import co.com.Autokoaj.tasks.AbrirPaginaKoaj;
import co.com.Autokoaj.tasks.FiltrarProducto;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltroStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @Dado("^que el usuario accede a la sección de productos$")
    public void queElUsuarioAccedeALaSecciónDeProductos() {

        theActorInTheSpotlight().wasAbleTo(AbrirPaginaKoaj.laPagina());
    }
    @Cuando("el usuario filtra el producto con los siguientes datos:")
    public void elUsuarioFiltraConDatos(DataTable dataTable) {
        Map<String, String> datos = dataTable.asMaps(String.class, String.class).get(0);

        String producto = datos.get("producto");
        String talla = datos.get("talla");
        String color = datos.get("color");
        String categoria = datos.get("categoría");

        theActorInTheSpotlight().attemptsTo(
                FiltrarProducto.conDatos(producto, talla, color, categoria)
        );
    }

    @Entonces("^el sistema debe confirmar que el artículo fue añadido correctamente al carrito$")
    public void elSistemaDebeConfirmarQueElArtículoFueAñadidoCorrectamenteAlCarrito() {
        theActorInTheSpotlight().should(seeThat(FiltroVisible.estaPresente()));
    }
}