package co.com.Autokoaj.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FiltroKoaj {

    public static Target BOTON_ahoraNo= Target.the("boton para quitar la ventana emergente")
            .located(By.id("btnNoIdWpnPush"));

    public static Target BARRA_BUSQUEDA = Target.the("Escribir el producto a buscar")
            .located(By.id("search_query_top"));

    public static final Target BARRA_BUSQUEDA_2 = Target.the("barra de búsqueda")
            .located(By.cssSelector("input.dfd-searchbox-input"));

    public static Target opcionTalla(String talla) {
        return Target.the("Seleccionar talla " + talla)
                .located(By.xpath("//button[@dfd-value-key='talla' and span[1][normalize-space(text())='" + talla + "']]"));
    }
    public static Target opcionColor(String color) {
        return Target.the("Seleccionar color " + color)
                .located(By.xpath("//button[@dfd-value-key='color' and span[2][normalize-space(text())='" + color + "']]"));
    }

    public static Target opcionCategoria(String categoria) {
        return Target.the("Seleccionar categoría " + categoria)
                .located(By.xpath("//button[@dfd-value-key='categories' and span[1][normalize-space(text())='" + categoria + "']]"));
    }


    public static Target BOTON_AGREGAR_AL_CARRITO = Target.the("Agregar al carrito")
            .located(By.xpath("//*[@id=\"df-result-product-bc430a79e4d36f58d10fb77497ed85c4-options\"]/div[3]/button"));

}
