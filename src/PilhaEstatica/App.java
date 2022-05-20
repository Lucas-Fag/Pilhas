package PilhaEstatica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaEstatica pilha = new PilhaEstatica(10);
        Scanner scn = new Scanner(System.in);

        while (!pilha.isFull()) {
            System.out.print("Informe um valor numerico: ");
            pilha.push(scn.nextInt());
        }

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

        scn.close();
    }
}
