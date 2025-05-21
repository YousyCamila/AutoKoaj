package co.com.Autokoaj.tasks;

import co.com.Autokoaj.userinterface.InicioKoaj;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaKoaj implements Task{

    private InicioKoaj inicioKoaj;

    public static AbrirPaginaKoaj laPagina() {
        return Tasks.instrumented(AbrirPaginaKoaj.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(inicioKoaj)
        );
    }
}
