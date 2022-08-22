# TA25-SpringREST-ER
### Detalles a tener en cuenta:

Debido a un error que creaba una columna de más en la tabla débil de la relación de 1 a N , he tenido que modificar algunas claves primarias solicitadas en el Ej2 y Ej3 , pasando estas a ser un campo normal y teniendo que poner un id autoincremental como PK para que Spring no diese problemas.

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
