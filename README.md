# Prueba-Konecta
Java

>Consulta del producto que tiene mayor stock

SELECT *
FROM Productos
WHERE stockProducto = (SELECT MAX(stockProducto)) FROM Productos)

_________________________________________________________

>El codigo se desarrollo con el ide netbeans
>La base de datos se contruyó en mysqlWorkbench

>No alcancé a terminar el modulo de ventas.

Fred Acosta Echeverria.
