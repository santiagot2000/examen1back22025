#Correcciones archivo curso
1.	@I y tiene que ser @ID linea 10
2.	Crear el @table con el nombre que llevaría la bases de datos linea 6
3.	@G y tiene que ser @GeneratedValue y al frente acabar de poner todo el enunciado completo (strategy = GenerationType.IDENTITY) linea 11
4.	Ponerle el ; al String nombre linea 13
5.	Mover docente para arriba y crearlo como private String linea 14
6.	Añadirle al constructor el dato docente linea 22
7.	Crear get y set linea 25
8.	Eliminar los datos que no hemos estudiado 

#Corrección archivo docente
1.	Completar y corregir el resto de @Entity linea 6
2.	Crear el @table con el nombre que llevaría la bases de datoslinea 7
3.	Le cree el @ID linea 10
9.	Eliminar los datos que no hemos estudiado 
4.	Crear constructore vacío y el lleno linea 18
5.	Revisar los get y set linea 23

#Corrección de usuario
1.	Eliminar los datos que no hemos estudiado
2.	Completar y corregir el resto de @Entity linea 8 
3.	acabar de poner todo el enunciado completo (strategy = GenerationType.IDENTITY) linea 13
4.	importar en enum linea 19
5.	crear get y set linea 33

#enum
se cera un enum de tipoUsuario con Estudiante, Docente, Administrador y Invitado
para que sea mucho más fácil para el cliente

#xampp
Crear la bases de datos en el archivo resources configurándolo con todo lo aprendido en clase
