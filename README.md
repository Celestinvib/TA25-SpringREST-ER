# TA25-SpringREST-ER
### Detalles a tener en cuenta:

Debido a un error que creaba una columna de más en la tabla débil de la relación de 1 a N , he tenido que modificar algunas claves primarias solicitadas en el Ej2 y Ej3 , pasando estas a ser un campo normal y teniendo que poner un id autoincremental como PK para que Spring no diese problemas.

### URIs endpoints:
#### URIs endpoints Ejercicio1  -> https://cka-ta25-ex1.herokuapp.com
```
Fabricantes
GET       /api/fabricantes
POST      /api/fabricantes
GET       /api/fabricantes/{id}
PUT       /api/fabricantes/{id}
DELETE    /api/fabricantes/{id}

Articulos
GET       /api/articulos
POST      /api/articulos
GET       /api/articulos/{id}
PUT       /api/articulos/{id}
DELETE    /api/articulos/{id}
```
#### URIs endpoints Ejercicio2 -> http://cka-ta25-ex2.herokuapp.com
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
#### URIs endpoints Ejercicio3 -> https://cka-ta25-ex3.herokuapp.com
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
#### URIs endpoints Ejercicio4 -> https://cka-ta25-ex4.herokuapp.com
```
Peliculas
GET       /api/peliculas
POST      /api/peliculas
GET       /api/peliculas/{code}
PUT       /api/peliculas/{code}
DELETE    /api/peliculas/{code}

Salas
GET       /api/salas
POST      /api/salas
GET       /api/salas/{code}
PUT       /api/salas/{code}
DELETE    /api/salas/{code}
```
