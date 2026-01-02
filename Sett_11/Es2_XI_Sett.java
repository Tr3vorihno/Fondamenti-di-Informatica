package Sett_11;
import ADT_Classi.StackByQueue;
import ADT_Classi.FixedStack;

public class Es2_XI_Sett {
    public static void main(String args[]) {
        StackByQueue s = new StackByQueue();
        FixedStack f = new FixedStack(); // La pila di confronto
        
        // --- 1. Riempimento Pile ---
        // Inserisco dati identici in entrambe
        // Nota: uso i dati che hai citato tu (1, 2, 3, pluto) per coerenza col tuo output
        s.push(new Integer(1));
        s.push(new Integer(2));
        s.push(new Integer(3));
        s.push("pluto");

        f.push(new Integer(1));
        f.push(new Integer(2));
        f.push(new Integer(3));
        f.push("pluto");

        // --- 2. Test TOP ---
        System.out.println("Test TOP su StackByQueue: " + s.top()); // Deve stampare pluto
        
        // --- 3. Test COMPARE STACKS ---
        System.out.println("\n--- Avvio compareStacks ---");
        boolean uguali = compareStacks(s, f);
        System.out.println("--- Fine compareStacks. Risultato: " + uguali + " ---\n");

        // --- 4. Verifica Finale (Stampa Distruttiva) ---
        // Se compareStacks ha funzionato bene, qui devo vedere TUTTI i dati.
        System.out.println("Contenuto StackByQueue (dovrebbe essere: pluto 3 2 1):");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        
        System.out.println("\n\nContenuto FixedStack (dovrebbe essere: pluto 3 2 1):");
        while (!f.isEmpty()) {
            System.out.print(f.pop() + " ");
        }
        System.out.println("\nfine");
    }

    public static boolean compareStacks(StackByQueue s, FixedStack p) {
        FixedStack temp1 = new FixedStack();
        FixedStack temp2 = new FixedStack();
        boolean answer = true;

        // A. Svuotamento nelle pile temporanee
        while (!s.isEmpty()) temp1.push(s.pop());
        while (!p.isEmpty()) temp2.push(p.pop());

        // B. Confronto e Ripristino
        // Usiamo || così se una pila è più lunga dell'altra non crashiamo e ripristiniamo tutto
        while (!temp1.isEmpty() || !temp2.isEmpty()) {
            
            Object obj1 = null;
            Object obj2 = null;
            
            boolean has1 = !temp1.isEmpty();
            boolean has2 = !temp2.isEmpty();
            
            // Preleviamo se possibile
            if (has1) obj1 = temp1.pop();
            if (has2) obj2 = temp2.pop();

            // *** RIPRISTINO IMMEDIATO ***
            // Rimettiamo i dati nelle pile originali PRIMA di fare qualsiasi controllo
            if (has1) s.push(obj1);
            if (has2) p.push(obj2);

            // LOGICA DI CONFRONTO
            if (has1 != has2) {
                // Lunghezze diverse
                answer = false; 
            } else {
                // Contenuto diverso? (Gestione Null Safe)
                if (obj1 == null) {
                    if (obj2 != null) answer = false;
                } else if (!obj1.equals(obj2)) {
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}