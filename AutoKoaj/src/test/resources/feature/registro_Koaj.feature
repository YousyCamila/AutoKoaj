# language: es
# author: Camila Guerra

Característica: Registro de usuario en el portal de Koaj
  Como nuevo usuario
  Quiero completar el formulario de registro
  Para crear una cuenta en la tienda en línea Koaj y acceder a mis beneficios.

  @registro

  Escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario accede a la página de registro de Koaj
    Cuando el usuario completa el primer formulario con los datos:
      | título                | Sr.                       |
      | nombre                | Camilo                    |
      | apellido              | Guerra                    |
      | correo                | camilo.guerra@example.com |
      | contraseña            | Password123               |
      | tipo documento        | Cédula de ciudadanía      |
      | número identificación | 1234567890                |
      | día                   | 12                        |
      | mes                   | 1                         |
      | año                   | 1995                      |
    Y hace clic en el botón "Continuar"
    Y completa el segundo formulario con los datos:
      | teléfono celular | 3001234567      |
      | país             | Colombia        |
      | departamento     | Bogota          |
      | ciudad           | 155             |
      | dirección        | Calle Falsa 123 |
    Y acepta los términos y condiciones
    Y acepta el tratamiento de datos personales según la Política de Protección de Datos
    Y hace clic en el botón "Registro"
    Entonces el usuario debe ser registrado exitosamente
