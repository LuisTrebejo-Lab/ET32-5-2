### Análisis — qué principios se violan
1. Viola SRP (Responsabilidad Única). La clase Pedido hace tres cosas distintas que no tienen relación entre sí: calcula el total, imprime un ticket, y guarda en la base de datos. Si cambia el formato del ticket, hay que tocar la misma clase que calcula precios. Tres razones distintas de cambio = tres responsabilidades mezcladas.

2. Viola OCP (Abierto/Cerrado). El método calcularTotal() tiene un if/else if con los tipos de pago escritos a mano. Si mañana se agrega un nuevo medio de pago (por ejemplo "MERCADOPAGO"), hay que modificar el método existente, en lugar de simplemente agregar algo nuevo sin tocar lo que ya funciona.

3. Viola DIP (Inversión de Dependencias). El método guardarEnBaseDeDatos() depende directamente de una tecnología concreta (SQL/MySQL "hardcodeado" dentro de la clase). Si se quisiera cambiar de motor de base de datos, o guardar en un archivo en vez de una BD, habría que reescribir Pedido — la clase de alto nivel depende de un detalle concreto de bajo nivel, no de una abstracción.
