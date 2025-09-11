## Batalla
Defina la **`clase abstracta Personaje`** con los *atributos: `vida, nivelAtaque, nivelDefensa y los métodos atacar():Integer` y defender(Integer puntos)*. **Implemente el método atacar pero no el método defender().**
- Luego, cree dos ***clases hijas donde ambas implementan el método defender*** de manera diferente. `Cada clase debe establecer una cantidad de puntos de vida por defecto`. 
- En un `ataque` se deben *realizar cierta cantidad de puntos de daño*.
- En la `defensa` se debe *reducir esa cantidad de puntos de daños*. 
- ***El resultado final de los puntos de ataque debe descontar la misma cantidad de puntos de vida del personaje que defiende.***

Realizar `tres combates` entre *Los Personaje*s ***`“Guerrero” y “Mago”`*** (instancias de Personaje). En un combate *`cada personaje realiza un ataque por turno`* y es *perdedor aquel que queda primero sin vida*. 
* En caso de que la `vida llegue a un valor negativo` el sistema debe lanzar un mensaje de *“Muerte”* y en el control de la misma **debe dejarse la vida en 0**. `La decisión de cual personaje ataca primero debe ser aleatoria`. 