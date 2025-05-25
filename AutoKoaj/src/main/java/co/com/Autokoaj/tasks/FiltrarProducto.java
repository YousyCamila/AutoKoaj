package co.com.Autokoaj.tasks;


import co.com.Autokoaj.userinterface.FiltroKoaj;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.thucydides.core.annotations.Step;

import static co.com.Autokoaj.userinterface.FiltroKoaj.BARRA_BUSQUEDA;


public class FiltrarProducto implements Task {

    private final String producto;
    private final String talla;
    private final String color;
    private final String categoria;

    public FiltrarProducto(String producto, String talla, String color, String categoria) {
        this.producto = producto;
        this.talla = talla;
        this.color = color;
        this.categoria = categoria;
    }

    public static FiltrarProducto conDatos(String producto, String talla, String color, String categoria) {
        return Tasks.instrumented(FiltrarProducto.class, producto, talla, color, categoria);
    }

    @Override
    @Step("{0} filtra y selecciona el producto con talla '#talla', color '#color' y categoría '#categoria'")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(FiltroKoaj.BOTON_ahoraNo, WebElementStateMatchers.isVisible()).forNoMoreThan(3).seconds(),
                    Click.on(FiltroKoaj.BOTON_ahoraNo)
            );
        } catch (Exception e) {
        }

        actor.attemptsTo(
                Click.on(BARRA_BUSQUEDA),
                Enter.theValue(producto).into(FiltroKoaj.BARRA_BUSQUEDA_2),
                Click.on(FiltroKoaj.opcionTalla(talla)),
                Click.on(FiltroKoaj.opcionColor(color)),
                Click.on(FiltroKoaj.opcionCategoria(categoria)),
                Click.on(FiltroKoaj.BTN_PRODUCTO),
                Click.on(FiltroKoaj.BOTON_AGREGAR_AL_CARRITO)
        );
    }
}
