## PUERTO

En un puerto se alquilan amarres para barcos de distinto tipo.  
+ Para cada **`ALQUILER`** se guarda el *`nombre y DNI del cliente, las fechas inicial y final de alquiler, la posición del amarre y el barco que lo ocupará`*.[✓]  
+ Un **`BARCO`** se caracteriza por su *`matrícula, su eslora en metros y año de fabricación`*.[✓]  

* Un *alquiler* se calcula multiplicando:[✓]  
	1. **`el número de días de ocupación`** (incluyendo los días inicial y final)  
	2. **`por un valor módulo de cada barco`** (obtenido simplemente multiplicando por 10 los metros de eslora) y  
	3. **`por un valor fijo (20.000 es en la actualidad)`**.  

* Sin embargo ahora se pretende diferenciar la información de algunos tipos de barcos:  
   - Número de mástiles para **`veleros`**  
   - Potencia en CV para embarcaciones **`deportivas`** a motor  
   - Potencia en CV y número de camarotes para **`yates`** de lujo  

* El *módulo de los barcos* de un tipo especial se obtiene como el módulo normal más:  
   - El número de mástiles para ***`veleros`***  
   - La potencia en CV para embarcaciones ***`deportivas`*** a motor  
   - La potencia en CV más el número de camarotes para ***`yates`*** de lujo  
Utilizando la herencia de forma apropiada, diseñe las clases y sus aciones, con detalle de atributos y métodos necesarios. Programe en Java los métodos que permitan calcular el alquiler de cualquier tipo de barco  