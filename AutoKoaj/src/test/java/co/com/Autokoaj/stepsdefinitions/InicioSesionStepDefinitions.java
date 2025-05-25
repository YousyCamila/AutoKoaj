package co.com.Autokoaj.stepsdefinitions;
import co.com.Autokoaj.questions.OpcionMiCuentaVisible;
import co.com.Autokoaj.tasks.AbrirPaginaKoaj;
import co.com.Autokoaj.tasks.Autenticarse;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinitions {
    @Dado("^que el usuario se encuentra en la página de inicio de sesión de Koaj$")
    public void queElUsuarioSeEncuentraEnLaPáginaDeInicioDeSesiónDeKoaj() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaKoaj.laPagina());
    }

    @Cuando("^ingrese las credenciales correctas \\(correo y contraseña\\)$")
    public void ingreseLasCredencialesCorrectasCorreoYContraseña(DataTable datos) {
        List<Map<String, String>> data = datos.asMaps(String.class, String.class);
        String correo = data.get(0).get("correo");
        String contraseña = data.get(0).get("contraseña");

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.con(correo, contraseña)
        );
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su perfil personal$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPerfilPersonal() {
        theActorInTheSpotlight().should(seeThat(OpcionMiCuentaVisible.estaPresente()));
    }

}
