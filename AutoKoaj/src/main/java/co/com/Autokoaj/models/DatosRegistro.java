package co.com.Autokoaj.models;

public class DatosRegistro {

    private String titulo;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String tipoDocumento;
    private String numeroIdentificacion;
    private String diaNacimiento;
    private String mesNacimiento;
    private String anioNacimiento;

    public DatosRegistro(String titulo, String nombre, String apellido, String email,
                         String contrasena, String tipoDocumento, String numeroIdentificacion,
                         String diaNacimiento, String mesNacimiento, String anioNacimiento) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getDiaNacimiento() {
        return diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public String getAnioNacimiento() {
        return anioNacimiento;
    }
}
