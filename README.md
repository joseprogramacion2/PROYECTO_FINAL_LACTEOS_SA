# PROYECTO_FINAL_LACTEOS_SA

# Lenguajes Utilizados en este programa:
-Java

# Descripción del Proyecto
Este proyecto es presentado como fase final de la etapa de aprendizaje del curso de Programación III sobre las aplicaciones móviles. Es un proyecto creado para una empresa llamada lácteos S.A, el cual necesita tener una mejor gestión en sus productos. 
“Lácteos S.A ” es una programa que te permitirá:
- Tener un inicio de sesión con verificación del usuario.
- Agregar productos al inventario.
- Eliminar un producto que haya sido registrado, mediante la búsqueda del mismo.
- Visualizar un listado completo de todos los productos que hayan sido registrados, y su cantidad disponible.

## Descripción del funcionamiento del programa
### Al entrar al programa se mostrara la ventana “INICIO DE SESIÓN”
- Se visualizaran dos campos uno para agregar el usuario y otro para agregar la contraseña de usuario y un botón donde se presione entrar cuando ya se hayan llenado los campos correspondientes, tiene una autenticación donde confirma si la contraseña es correcta, si la contraseña es correcta y el usuario dejara entrar, pero si al contrario es incorrecta la contraseña o el usuario no dejara entrar al programa y mostrara un mensaje “usuario/contraseña incorrecta” y deberá ingresar los dos datos de nuevo.
### Luego de ingresar el usuario y contraseña correctos entraremos a la ventana “Menú”
- Aparecerán tres botones, el usuario deberá elegir dependiendo la acción que sea realizar, ya sea registrar un nuevo producto, eliminar un producto o ver ya sea la lista de los productos que hay o verificar la existencia de algún producto en especial.
### Si elegimos entrar a la función “REGISTRAR PRODUCTO
- Visualizaremos 5 campos donde 3 los ingresara manualmente el usuario y 2 son de elección.
- En el primer campo, se debe seleccionar entre las  opciones de producto, ya sea este, “leche” , “queso“, “crema”, “mantequilla” y “Yogurt”.
- En el segundo campo, no se debera ingresar nada ya que el codigo de producto es auto incrementable.
- En el tercer campo se debe colocar la cantidad de producto total que se desea agregar al inventario.
- En el cuarto campo, se debe colocar la fecha de ingreso del producto.
- En el quinto campo, se debe colocar la fecha en la que vence dicho producto.
- Luego de haber ingresado los datos en los campos correspondientes, se debe presionar el botón “REGISTRAR PRODUCTO” y estos mismos serán registrados en la base de datos correspondiente.
### Si elegimos entrar a la función “ELIMINAR PRODUCTO”
- Visualizaremos 1 campo donde se deberá ingresar el código del producto que se desea eliminar.
- También habrá un botón, el cual se deberá presionar después de haber ingresado el código del producto a eliminar.
- Al haber presionado el botón, se podrá visualizar los datos que coincidan con la búsqueda realizada, estos datos se visualizaran en la lista que podremos ver allí mismo.
- Luego de haber encontrado el dato que deseamos eliminar, presionamos el botón “ELIMINAR PRODUCTO” se borrara ese dato de la base donde se estaba guardado.
### si elegimos entrar a la función “LISTA DE PRODUCTO”
- Se visualizara un campo donde se pueden ingresar datos, un botón y una lista donde se mostraran datos.
- Si solamente pulsamos el botón “CONSULTA” se mostraran todos los datos que existan en la base datos.
- Si se desea que esta lista muestre datos mas específicos, se deberá ingresar el código respectivo del producto.
- La lista que se visualizara, mostrara los 5 campos que se hayan ingresado en el registro.
### si presionamos el boton “Salir”
- El programa se cerrara al presionar el botón “Salir”.
