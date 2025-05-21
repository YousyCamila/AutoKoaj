# language: es
# author: Camila Guerra

Característica: Registro de usuario en el portal de Koaj
  Como nuevo usuario
  Quiero completar el formulario de registro
  Para crear una cuenta en la tienda en línea Koaj y acceder a mis beneficios.

  @registro

  Escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario accede a la página de registro de Koaj
    Cuando el usuario completa el formulario con los datos: título "Sr.", nombre "Camilo", apellido "Guerra", correo "camilo.guerra@example.com", contraseña "Password123", tipo documento "Cédula de ciudadanía", número identificación "1234567890", día "21", mes "mayo" y año "1995"
    Entonces el usuario debe ser registrado exitosamente
