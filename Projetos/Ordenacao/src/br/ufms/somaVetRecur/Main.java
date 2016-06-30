package br.ufms.somaVetRecur;

/**
 * Created by rafael on 30/06/16.
 */
public class Main {
    public static void main(String args[]) {
   Soma soma = new Soma();
    int [] vet = new int[10];

        for (int i =0;i<vet.length;i++) {
            vet[i] = i+10;
        }

        for (int i =0;i<vet.length;i++) {
            System.out.println(vet[i]);
        }
        System.out.println(soma.recus(vet));
    }
}
