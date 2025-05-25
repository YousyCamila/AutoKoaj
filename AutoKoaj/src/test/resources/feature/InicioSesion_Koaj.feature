# language: es
# author: Camila Guerra

Característica: Autenticación en la página de Koaj
  Como usuario registrado
  Quiero iniciar sesión en el portal de Koaj
  Para acceder a mi cuenta y gestionar mis pedidos y preferencias.

  @autenticacion

  Escenario: Verificar la autenticación exitosa en la página de Koaj
    Dado que el usuario se encuentra en la página de inicio de sesión de Koaj
    Cuando ingrese las credenciales correctas (correo y contraseña)
      | correo                    | contraseña  |
      | camilo.guerra@example.com | Password123 |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su perfil personal
