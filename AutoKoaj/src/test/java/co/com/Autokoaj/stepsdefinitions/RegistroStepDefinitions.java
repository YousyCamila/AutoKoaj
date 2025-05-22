package co.com.Autokoaj.stepsdefinitions;

import co.com.Autokoaj.models.DatosRegistro;
import co.com.Autokoaj.models.DatosRegistroComplementario;
import co.com.Autokoaj.questions.OpcionMiCuentaVisible;
import co.com.Autokoaj.tasks.AbrirPaginaKoaj;
import co.com.Autokoaj.tasks.CompletarRegistroComplementario;
import co.com.Autokoaj.tasks.Registrarse;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroStepDefinitions {

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario accede a la página de registro de Koaj$")
    public void queElUsuarioAccedeALaPáginaDeRegistroDeKoaj() {
        theActorCalled("Usuario").wasAbleTo(
                AbrirPaginaKoaj.laPagina()
        );
    }

    @Cuando("^el usuario completa el primer formulario con los datos:$")
    public void elUsuarioCompletaElPrimerFormularioConLosDatos(DataTable dataTable) {
        java.util.Map<String, String> data = dataTable.asMap(String.class, String.class);

        DatosRegistro datos = new DatosRegistro(
                data.get("título"),
                data.get("nombre"),
                data.get("apellido"),
                data.get("correo"),
                data.get("contraseña"),
                data.get("tipo documento"),
                data.get("número identificación"),
                data.get("día"),
                data.get("mes"),
                data.get("año")
        );

        theActorInTheSpotlight().attemptsTo(
                Registrarse.conDatos(datos)
        );
    }

    @Y("^hace clic en el botón \"Continuar\"$")
    public void haceClicEnElBotónContinuar() {

    }

    @Y("^completa el segundo formulario con los datos:$")
    public void completaElSegundoFormularioConLosDatos(DataTable dataTable) {
        java.util.Map<String, String> data = dataTable.asMap(String.class, String.class);

        DatosRegistroComplementario datos = new DatosRegistroComplementario(
                data.get("teléfono celular"),
                data.get("país"),
                data.get("departamento"),
                data.get("ciudad"),
                data.get("dirección")
        );

        theActorInTheSpotlight().attemptsTo(
                CompletarRegistroComplementario.conDatos(datos)
        );
    }

    @Y("^acepta los términos y condiciones$")
    public void aceptaLosTérminosYCondiciones() {

    }

    @Y("^acepta el tratamiento de datos personales según la Política de Protección de Datos$")
    public void aceptaTratamientoDeDatos() {

    }

    @Y("^hace clic en el botón \"Registro\"$")
    public void haceClicEnElBotónRegistro() {

    }

    @Entonces("^el usuario debe ser registrado exitosamente$")
    public void elUsuarioDebeSerRegistradoExitosamente() {
        theActorInTheSpotlight().should(seeThat(OpcionMiCuentaVisible.estaPresente()));
    }
}


