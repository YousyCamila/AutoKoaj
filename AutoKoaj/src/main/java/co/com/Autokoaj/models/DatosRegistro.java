package co.com.Autokoaj.models;

public class DatosRegistro {

    private String titulo;              // "Sr." o "Sra."
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String tipoDocumento;       // Ej: "Cédula de ciudadanía"
    private String numeroIdentificacion;
    private String diaNacimiento;       // Ej: "21"
    private String mesNacimiento;       // Ej: "Mayo" o "05" (depende de cómo esté en el select)
    private String anioNacimiento;      // Ej: "1995"

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
