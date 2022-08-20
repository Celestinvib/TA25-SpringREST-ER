# TA25-SpringREST-ER
### Detalles a tener en cuenta:

Los proyectos son creados con las librerías necesarias y tienen una estructura correcta, pero al realizar inserts via SQL o endpoints con POSTMAN da un error extraño según la acción que hagas.
Si se intentan hacer más inserts en la tabla(relación de N) de los que hay en la otra tabla(relación del 1) pasa del código de referencia de ref (fk) que se ha introducido y pone en el insert uno autoincremental.

##### [Tabla realación 1] 
En la tabla items ya hay 2 registros que se han creado con normalidad.

![Manufacters](https://user-images.githubusercontent.com/55434881/185720838-c5283d3a-b7ec-48f4-949c-bdcf853e247d.JPG)

Pero al hacer otro insert más referenciando al fabricante 1 , el sql interpreta que es se esta haciendo al 3.

![InsertItemFail1](https://user-images.githubusercontent.com/55434881/185720887-82ea0a7b-ca15-4e93-ac31-024f807ab13a.png)

Si se modifica la query y se intenta volver a insertar , autoincrementa y piensa que refer al fabricante 4 y así (5,6,7..) por cada vez que hagamos insert apartir de ahora.

![InsertItemFail2](https://user-images.githubusercontent.com/55434881/185720893-96867339-faba-4b73-9f7d-3d920d0df77f.png)

Después de comparar mis ejercicios con las actividades de ejemplo , con actividades de otros compañeros y de mucho buscar en internet, aparentemente no hay nada referente a este error y todo esta implementado correctamente. 
¿Cómo probar los endpoints sin que pase el error?
Añadir primero los inserts de la tabla del 1 y luego menos o el mismo número de inserts en la tabla del N.

Aparte  debido a un error que creaba una columna de más en la tabla débil de la relación de 1 a N , he tenido que modificar algunas claves primarias solicitadas en el Ej2 y Ej3 , pasando estas a ser un campo normal y teniendo que poner un id autoincremental como PK para que Spring no diese problemas.


### URIs endpoints:
#### URIs endpoints Ejercicio1 
```
Fabricantes
GET       /api/fabricantes
POST      /api/fabricantes
GET       /api/fabricantes/{id}
PUT       /api/fabricantes/{id}
DELETE    /api/fabricantes/{id}

Articulos
GET       /api/articulos
POST      /api/fabricantes
GET       /api/fabricantes/{id}
PUT       /api/fabricantes/{id}
DELETE    /api/fabricantes/{id}
```
#### URIs endpoints Ejercicio2 
```
Departamentos
GET       /api/departamentos
POST      /api/departamentos
GET       /api/departamentos/{id}
PUT       /api/departamentos/{id}
DELETE    /api/departamentos/{id}

Empleados
GET       /api/empleados
POST      /api/empleados
GET       /api/empleados/{id}
PUT       /api/empleados/{id}
DELETE    /api/empleados/{id}
```
#### URIs endpoints Ejercicio3 
```
Almacenes
GET       /api/almacenes
POST      /api/almacenes
GET       /api/almacenes/{id}
PUT       /api/almacenes/{id}
DELETE    /api/almacenes/{id}

Cajas
GET       /api/cajas
POST      /api/cajas
GET       /api/cajas/{id}
PUT       /api/cajas/{id}
DELETE    /api/cajas/{id}
```
#### URIs endpoints Ejercicio4 
```
Peliculas
GET       /api/peliculas
POST      /api/peliculas
GET       /api/peliculas/{id}
PUT       /api/peliculas/{id}
DELETE    /api/peliculas/{id}

Salas
GET       /api/salas
POST      /api/salas
GET       /api/salas/{id}
PUT       /api/salas/{id}
DELETE    /api/salas/{id}
```
