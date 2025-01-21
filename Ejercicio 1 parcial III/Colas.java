import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Colas {
    public static void main(String[] args) {
        // las colas
        System.out.println(" COLA ");
        Queue<String> cola = new LinkedList<>();

        // agregando nombres a las colas
        cola.add("Ana");
        cola.add("Pablo");
        cola.add("Lucía");
        cola.add("Jose");

        // se muestra el primer elemento en la cola
        System.out.println("Primer elemento en la cola: " + cola.peek());

        // elimina el nombre "Lucía"
        cola.remove("Lucía");

        // muestra los elementos restantes
        System.out.println("Elementos en la cola después de eliminar Lucía: " + cola);

        // pila
        System.out.println("\n PILA ");
        Stack<String> pila = new Stack<>();

        // agrego nombres a la pila
        pila.push("Ana");
        pila.push("Pablo");
        pila.push("Lucía");
        pila.push("Jose");

        // se muestra el último elemento agregado
        System.out.println("Elemento en la cima de la pila: " + pila.peek());

        // elimina el nombre de "Lucía" en la pila
        pila.remove("Lucía");

        // muestra los elementos restantes de la pila
        System.out.println("Elementos en la pila después de eliminar Lucia: " + pila);
    }
}

