package co.com.Autokoaj.tasks;

import co.com.Autokoaj.models.DatosRegistro;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.Autokoaj.userinterface.Registro.*;  // importa tus Targets de Registro

public class Registrarse implements Task {

    private DatosRegistro datosRegistro;

    public Registrarse(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static Registrarse conDatos(DatosRegistro datosRegistro) {
        return Instrumented.instanceOf(Registrarse.class).withProperties(datosRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTON_REGISTRARSE),
                Click.on(datosRegistro.getTitulo().equalsIgnoreCase("Sr.") ? RADIO_TITULO_SR : RADIO_TITULO_SRA),
                Enter.theValue(datosRegistro.getNombre()).into(INPUT_NOMBRE),
                Enter.theValue(datosRegistro.getApellido()).into(INPUT_APELLIDO),
                Enter.theValue(datosRegistro.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(datosRegistro.getContrasena()).into(INPUT_CONTRASENA),
                Enter.theValue(datosRegistro.getContrasena()).into(INPUT_CONFIRMAR_CONTRASENA),
                SelectFromOptions.byVisibleText(datosRegistro.getTipoDocumento()).from(SELECT_TIPO_DOCUMENTO),
                Enter.theValue(datosRegistro.getNumeroIdentificacion()).into(INPUT_NUMERO_IDENTIFICACION),
                SelectFromOptions.byValue(datosRegistro.getDiaNacimiento()).from(SELECT_DIA),
                SelectFromOptions.byValue(datosRegistro.getMesNacimiento()).from(SELECT_MES),
                SelectFromOptions.byValue(datosRegistro.getAnioNacimiento()).from(SELECT_ANIO),
                Click.on(BOTON_CONTINUAR)
        );
    }
}
