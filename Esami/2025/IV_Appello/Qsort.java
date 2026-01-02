//package Esami;//.2025.IV_Appello;
import java.util.Scanner;
import java.io.*;
//import Esami
import static java.lang.System.*;

 // Metodo main per testare la soluzione
    public class Qsort {
    public static void main(String[] args) {
        // Crea una nuova coda
        CR queue = new QueueSorter();

        // Aggiunge alcuni numeri interi alla coda in ordine casuale
        queue.enqueue(42);
        queue.enqueue(2);
        queue.enqueue(69);
        queue.enqueue(1);
        queue.enqueue(42);
        queue.enqueue(103);
        queue.enqueue(901);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(2);
        queue.enqueue(0);
       
        System.out.println("Coda originale:");
        printQueue(queue);
        System.out.println("Sort:");
        // Ordina la coda
        QueueSorter.sort(queue);

        System.out.println("\nCoda ordinata:");
        printQueue(queue);
    }

    // Metodo di utilità per stampare il contenuto della coda
    private static void printQueue(CR queue) {
        CR supp = new QueueSorter();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Object element = queue.dequeue();
            System.out.print(element + " ");
            supp.enqueue(element);
        }
        for (int i = 0; i < size; i++) {
            Object element = supp.dequeue();
            //System.out.print(element + " ");
            queue.enqueue(element);
        }
        System.out.println();
    }
}

