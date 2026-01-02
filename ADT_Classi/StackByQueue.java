package ADT_Classi;
import ADT_Interfacce.*;
import java.util.EmptyStackException;
import ADT_Classi.FixedQueue; // Assicurati che l'import sia corretto per la tua Coda
import ADT_Classi.FixedStack;      // L'interfaccia Stack

public class StackByQueue implements Stack { 
    
    private FixedQueue q; // Unica variabile di esemplare ammessa

    public StackByQueue() {
        this.q = new FixedQueue(); 
    }

    // Ritorna true se la coda interna è vuota
    public boolean isEmpty() {
        return q.isEmpty();
    }

    // PUSH: Inserimento immediato O(1)
    public void push(Object obj) {
        q.enqueue(obj); 
    }

    // TOP: Legge l'ultimo elemento senza rimuoverlo - O(n)
    public Object top() {
        if (isEmpty()) throw new EmptyStackException();

        FixedQueue temp = new FixedQueue(); // Coda di appoggio
        Object obj = null;

        // 1. Sposto tutto in temp per trovare l'ultimo elemento
        while (!q.isEmpty()) {
            obj = q.dequeue(); // L'ultimo assegnamento sarà il top
            temp.enqueue(obj); // Salvo tutto in temp per non perdere dati
        }

        // 2. Ripristino: rimetto tutto in q nello stesso ordine
        while (!temp.isEmpty()) {
            q.enqueue(temp.dequeue());
        }

        return obj;
    }

    // POP: Rimuove e restituisce l'ultimo elemento - O(n)
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        
        FixedQueue temp = new FixedQueue();
        Object obj = null;

        // 1. Svuoto q in temp, tranne l'ultimo elemento
        while (!q.isEmpty()) {
            obj = q.dequeue();
            // Se la coda NON è vuota dopo il dequeue, vuol dire che 'obj' non è l'ultimo.
            // Quindi lo salviamo in temp.
            if (!q.isEmpty()) { 
                temp.enqueue(obj);
            }
            // Se la coda ORA è vuota, 'obj' è l'elemento da rimuovere (non lo metto in temp)
        }

        // 2. Ripristino gli elementi rimanenti
        while (!temp.isEmpty()) {
            q.enqueue(temp.dequeue());
        }

        return obj;
    }
    public void makeEmpty() {
        q.makeEmpty(); 
    }
}