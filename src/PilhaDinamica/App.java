package PilhaDinamica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaDinamica pilha = new PilhaDinamica();
        Scanner scn = new Scanner(System.in);
        String resp;

        do {
            System.out.print("Informe algo para inserir na pilha: ");
            pilha.push(scn.nextLine());

            System.out.print("Inserir outro elemento? (S/N) ");
            resp = scn.nextLine();
        } while (resp.equalsIgnoreCase("S"));

        pilha.percorrer();

        scn.close();
    }
}
