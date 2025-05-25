package co.com.Autokoaj.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Registro extends PageObject {

    public static Target BTON_REGISTRARSE = Target.the("Oprimir el boton para registrarse")
            .located(By.xpath("//*[@id=\"auth_right_column\"]/div/div/a"));

    public static Target RADIO_TITULO_SR = Target.the("Seleccionar título Señor")
            .located(By.id("id_gender1"));

    public static Target RADIO_TITULO_SRA = Target.the("Seleccionar título Señora")
            .located(By.id("id_gender2"));

    public static Target INPUT_NOMBRE = Target.the("Campo para ingresar el nombre")
            .located(By.id("customer_firstname"));

    public static Target INPUT_APELLIDO = Target.the("Campo para ingresar el apellido")
            .located(By.id("customer_lastname"));

    public static Target INPUT_EMAIL = Target.the("Campo para ingresar el correo electrónico")
            .located(By.id("email-register"));

    public static Target INPUT_CONTRASENA = Target.the("Campo para ingresar la contraseña")
            .located(By.id("passwd"));

    public static Target INPUT_CONFIRMAR_CONTRASENA = Target.the("Campo para confirmar la contraseña")
            .located(By.id("repeat_passwd"));

    public static Target SELECT_TIPO_DOCUMENTO = Target.the("Seleccionar tipo de documento")
            .located(By.id("document_type"));

    public static Target INPUT_NUMERO_IDENTIFICACION = Target.the("Campo para número de identificación")
            .located(By.id("dni"));

    public static Target SELECT_DIA = Target.the("Selector para el día de nacimiento")
            .located(By.id("days"));

    public static Target SELECT_MES = Target.the("Selector para el mes de nacimiento")
            .located(By.id("months"));

    public static Target SELECT_ANIO = Target.the("Selector para el año de nacimiento")
            .located(By.id("years"));

    public static Target BOTON_CONTINUAR = Target.the("Botón para continuar con el registro")
            .located(By.id("continue_first_part"));
}
