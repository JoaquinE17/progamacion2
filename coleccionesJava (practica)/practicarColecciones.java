/*
Un Establecimiento educativo necesita implementar un sistema en el que se puedan cargar alumnos que
cursan una asignatura, los datos que caracterizan a los alumnos son: el nombre y apellido, Libreta
Universitaria, sexo, condición (regular o condicional) y la nota final.
Los datos para una asignatura son Nombre de la Asignatura, Año, Total de Hs,
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a
continuación:
1.Mostrar en pantalla todos los alumnos que se encuentren en la asignatura.
2.Mostrar en pantalla los alumnos que se encuentren como condicional y su cantidad.
3.Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en pantalla.
4.Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla
*/
import java.util.Scanner;

class practicarColecciones{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// Menu
		System.out.println("####  Establecimiento Educativo  ####");
		System.out.println(" 1. Mostrar alumnos de una asignatura");
		System.out.println(" 2. Mostrar alumnos en estado condicional");
		System.out.println(" 3. Ordenar alumnos (nota mayor a menor)");
		System.out.println(" 4. Ordenar alumnos (nombre/apellido)");
		System.out.println(" q. Salir");
		String eleccion = scan.nextLine();
		switch(eleccion){
			case "1":
				alumnosAsignatura();
				break;
			case "2";
				alumnosEstadoCondicional();
				break;
			case "3":
				ordenarNotaMaxMin();
				break;
			case "4";
				ordenarNombreApellido();
				break;
			case "q":
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Error: El valor ingresado es invalido.");

		}
	}
}

/*
🧩 ¿Qué es una interfaz en Java?

Una interfaz en Java es un tipo de contrato que define qué debe hacer una clase, pero no cómo lo hace.

public interface Vehiculo {
    void mover();
}


Esto significa que cualquier clase que implemente esa interfaz debe definir el comportamiento del método mover().

🏗️ ¿Qué es una implementación?

Una implementación es una clase que proporciona el código real para los métodos definidos en una interfaz.

public class Auto implements Vehiculo {
    @Override
    public void mover() {
        System.out.println("El auto se mueve.");
    }
}

✅ Apliquemos esto a las colecciones

En Java, las colecciones están diseñadas usando interfaces para permitir flexibilidad y escalabilidad. Luego, se utilizan clases concretas que implementan esas interfaces.

🔷 Principales interfaces del framework de colecciones
Interfaz		¿Qué representa?							Métodos clave
Collection<E>	Raíz de todas las colecciones				add(), remove(), size()
List<E>			Lista ordenada, puede tener duplicados		get(), add(index, elem), remove()
Set<E>			Conjunto sin duplicados						add(), contains()
Map<K, V>		Pares clave-valor							put(), get(), remove()
Queue<E>		Cola FIFO									offer(), poll(), peek()
🔶 Implementaciones comunes
Interfaz			Clase de implementación	Características
List	ArrayList	Lista dinámica, acceso rápido por índice
List	LinkedList	Inserción/eliminación eficiente
Set	HashSet	Sin duplicados, sin orden
Set	TreeSet	Sin duplicados, ordenado
Map	HashMap	Claves únicas, sin orden
Map	TreeMap	Claves ordenadas
Queue	LinkedList	Comportamiento de cola
Queue	PriorityQueue	Orden basado en prioridad
🧠 ¿Por qué usar interfaces en lugar de clases concretas?

Esto es clave:

// BUENA PRÁCTICA
List<String> nombres = new ArrayList<>();


En lugar de:

// NO RECOMENDADO
ArrayList<String> nombres = new ArrayList<>();

✅ Ventajas:

Flexibilidad: podés cambiar la implementación fácilmente sin cambiar el resto del código.

Abstracción: trabajás con "lo que hace", no "cómo lo hace".

Mantenimiento más fácil: se desacopla el código.

Reutilización: podés pasar listas, sets, etc. como argumentos a métodos sin importar la implementación específica.

🧪 Ejemplo práctico:
public class Main {
    public static void main(String[] args) {
        // Cambiá solo esta línea si querés usar otra implementación
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");

        imprimir(frutas);
    }

    // Este método acepta cualquier tipo de List
    public static void imprimir(List<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }
}


Puedo reemplazar new ArrayList<>() por new LinkedList<>() sin cambiar nada más.

📌 En resumen
Concepto	Ejemplo	¿Qué hace?
Interfaz	List	Define qué puede hacer una lista
Implementación	ArrayList, LinkedList	Define cómo lo hace internamente
Declarar por interfaz	List<String> lista = new ArrayList<>();	Recomendado por flexibilidad
*/