# cajeroVirtual
Proyecto que simula un cajero virtual para realizar operaciones entre dos tipos de cuentas bancarias.

***ACCESO***

Al iniciar la aplicación te solicitará el número de cuenta con la que se quiere operar, para poder acceder el ID de las cuentas son 1000 o 2000.

* Al seleccionar ‘Ingresar’ o ‘Extraer’, nos solicitará la cantidad para hacer esa operación, y se actualizará en el saldo de la cuenta.
  * Sí al extraer dinero, el saldo da negativo te impedirá sacar esa cantidad.
* A la hora de realizar una transferencia te solicitará la cuenta destino y la cantidad a transferir.
  * Si la cuenta beneficiaria no existe te mostrará la aplicación que no existe esa cuenta.
  * Con esta operación, se registrará un movimiento de extración en la cuenta de origen y uno de ingreso en la cuenta beneficiaria.
* Finalmente, la operación "Ver Movimientos" te aparecerá un listado con los movimientos realizados sobre la cuenta, además de mostrar el saldo.
