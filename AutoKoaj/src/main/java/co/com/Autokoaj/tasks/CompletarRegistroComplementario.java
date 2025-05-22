package co.com.Autokoaj.tasks;
import co.com.Autokoaj.models.DatosRegistroComplementario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.Autokoaj.userinterface.RegistroComplementario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarRegistroComplementario implements Task {

    private final DatosRegistroComplementario datos;

    public CompletarRegistroComplementario(DatosRegistroComplementario datos) {
        this.datos = datos;
    }

    public static CompletarRegistroComplementario conDatos(DatosRegistroComplementario datos) {
        return instrumented(CompletarRegistroComplementario.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getTelefonoCelular()).into(INPUT_TELEFONO_CELULAR),
                SelectFromOptions.byVisibleText(datos.getPais()).from(SELECT_PAIS),
                SelectFromOptions.byVisibleText(datos.getDepartamento()).from(SELECT_DEPARTAMENTO),
                SelectFromOptions.byValue(datos.getCiudad()).from(SELECT_CIUDAD),
                Enter.theValue(datos.getDireccion()).into(INPUT_DIRECCION),
                Click.on(CHECKBOX_TERMINOS),
                Click.on(CHECKBOX_TRATAMIENTO_DATOS),
                Click.on(BOTON_REGISTRAR)
        );
    }
}
