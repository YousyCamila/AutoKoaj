package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.CredencialesInicioSesion;
import co.com.AutoFacebook.tasks.AbrirPagina;
import co.com.AutoFacebook.tasks.Autenticarse;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutentificacionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Facebook$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeFacebook() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }
    
    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(List<CredencialesInicioSesion> credenciales )
    {
        theActorInTheSpotlight().attemptsTo(Autenticarse.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de Facebook$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeInicioDeFacebook() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
