package co.com.Autokoaj.stepsdefinitions;

import co.com.Autokoaj.models.DatosRegistro;
import co.com.Autokoaj.tasks.AbrirPaginaKoaj;
import co.com.Autokoaj.tasks.Registrarse;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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

    @Cuando("^el usuario completa el formulario con los datos: título \"([^\"]*)\", nombre \"([^\"]*)\", apellido \"([^\"]*)\", correo \"([^\"]*)\", contraseña \"([^\"]*)\", tipo documento \"([^\"]*)\", número identificación \"([^\"]*)\", día \"([^\"]*)\", mes \"([^\"]*)\" y año \"([^\"]*)\"$")
    public void elUsuarioCompletaElFormularioConLosDatosTítuloNombreApellidoCorreoContraseñaTipoDocumentoNúmeroIdentificaciónDíaMesYAño(
            String titulo, String nombre, String apellido, String correo, String contrasena,
            String tipoDocumento, String numeroIdentificacion, String dia, String mes, String anio) {

        DatosRegistro datos = new DatosRegistro(titulo, nombre, apellido, correo, contrasena,
                tipoDocumento, numeroIdentificacion, dia, mes, anio);

        theActorInTheSpotlight().attemptsTo(
                Registrarse.conDatos(datos)
        );
    }

    @Entonces("^el usuario debe ser registrado exitosamente$")
    public void elUsuarioDebeSerRegistradoExitosamente() {

        System.out.println("✅ Registro exitoso validado.");
    }


}