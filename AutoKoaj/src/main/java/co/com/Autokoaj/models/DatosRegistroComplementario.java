package co.com.Autokoaj.models;

public class DatosRegistroComplementario {
    private String telefonoCelular;
    private String pais;
    private String departamento;
    private String ciudad;
    private String direccion;

    public DatosRegistroComplementario(String telefonoCelular, String pais, String departamento, String ciudad, String direccion) {
        this.telefonoCelular = telefonoCelular;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public String getPais() {
        return pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
}
