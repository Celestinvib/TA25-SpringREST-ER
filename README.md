# TA25-SpringREST-ER
### Detalles a tener en cuenta:

Debido a un error que creaba una columna de más en la tabla débil de la relación de 1 a N , he tenido que modificar algunas claves primarias solicitadas en el Ej2 y Ej3 , pasando estas a ser un campo normal y teniendo que poner un id autoincremental como PK para que Spring no diese problemas.

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

