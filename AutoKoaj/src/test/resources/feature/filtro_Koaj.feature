# language: es
# author: Camila Guerra

Característica: Filtrado de productos en Koaj
  Como usuario autenticado en el portal de Koaj
  Quiero aplicar filtros a los productos
  Para encontrar artículos específicos y agregarlos al carrito de manera sencilla.

  Antecedentes:
    Dado que el usuario se encuentra en la página de inicio de sesión de Koaj
    Cuando ingrese las credenciales correctas (correo y contraseña)
      | correo                    | contraseña  |
      | camilo.guerra@example.com | Password123 |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su perfil personal

  @filtro
  Escenario: Buscar y filtrar un buzo oversize, y agregarlo al carrito usando tabla de datos
    Dado que el usuario accede a la sección de productos
    Cuando el usuario filtra el producto con los siguientes datos:
      | producto       | talla | color | categoría |
      | buzo oversize  | M     | Negro | Mujer     |
    Entonces el sistema debe confirmar que el artículo fue añadido correctamente al carrito

