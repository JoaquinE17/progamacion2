## Implementar:  

Comandos:  
---------  
[x] comer() -  
[x] beber() -  
[x] dormir() -  
[x] despertar() -  
[x] caminar()  
[x] correr()  
[x] saltar()  

+ Todos los *comandos* retorna valores *booleano*.  

Consultas:  
----------  
[x] obtenerEnergia() *retorna entero* << 
[.] estaDormido() *retorna booleano*  
[x] obtenerCantDesgaste() *retorna entero*  
[x] obtenerCantComer() *retorna entero*  
[.] obtenerHumor() *retorna entero*  
[.] estaVivo() *retorna booleano*  

## Acciones a agregar:  
[x] mostrarMascota() `toString()`   
[x] agregar un atributo *nombre*, para identificar  
[p] Respetar los niveles de MAX y MIN*  
[x] Una mascota dormida no realiza acciones
[.] Modificar nivel de hambre (cantComer) 

[x] Las operaciones que incrementan el nivel de energía son **comer, beber y dormir**. 
[x] Cuando **duerme** recupera el 25% de su energía.
[x] Cuando esta sin vida, dormido cambiar a true.  
[x] Mientras duerme no puede hacer ninguna otra acción, a menos que antes se lo despierte.  

[x] Las acciones que decrementan el nivel de energía de la mascota son caminar, correr y saltar, si bien lo hacen en distinto grado. ***Ninguna mascota puede realizar más de tres acciones de desgaste en forma consecutiva***. Al cuarto intento, ignora la orden dada y directamente se pone a dormir. Cuando se
vuelva a despertar, podrá volver a realizar a lo sumo tres acciones de desgaste.

[x] Asimismo, si **come o bebe** cinco veces seguidas morirá al instante de indigestión.

[x] La mascota manifiesta diferentes grados de humor, los que expresa mediante un valor numérico que va de 1 a 5, siendo 1 el más infeliz y 5 el más contento

Energía Humor
Entre 0 y 20 (1)
Entre 21 y 40 (2)
Entre 41 y 60 (3)
Entre 61 y 80 (4)
Entre 81 y 100 (5)