package co.com.Autokoaj.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.Autokoaj.userinterface.InicioSesion;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Autenticarse implements Task {

    private final String correo;

    private final String contraseña;

    public Autenticarse (String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public static Autenticarse con(String correo, String contraseña) {
        return Tasks.instrumented(Autenticarse.class, correo, contraseña);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(InicioSesion.IMPUT_CORREO),
                Enter.theValue(contraseña).into(InicioSesion.IMPUT_CONTRASEÑA),
                Click.on(InicioSesion.BTN_INICIOSESION)
        );
    }

}
