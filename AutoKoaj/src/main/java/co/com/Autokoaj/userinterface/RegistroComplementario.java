package co.com.Autokoaj.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroComplementario {
    public static final Target INPUT_TELEFONO_CELULAR = Target.the("Campo teléfono celular")
            .located(By.id("phone_mobile"));

    public static final Target SELECT_PAIS = Target.the("Selector país")
            .located(By.id("id_country"));

    public static final Target SELECT_DEPARTAMENTO = Target.the("Selector departamento")
            .located(By.id("id_state"));

    public static final Target SELECT_CIUDAD = Target.the("Selector ciudad")
            .located(By.id("id_city"));

    public static final Target INPUT_DIRECCION = Target.the("Campo dirección")
            .located(By.id("address1"));

    public static final Target CHECKBOX_TERMINOS = Target.the("Checkbox términos y condiciones")
            .located(By.id("fake_lopd"));

    public static final Target CHECKBOX_TRATAMIENTO_DATOS = Target.the("Checkbox tratamiento de datos")
            .located(By.id("acceptLopd"));

    public static final Target BOTON_REGISTRAR = Target.the("Botón registrar")
            .located(By.id("submitAccount"));
}