package br.ufms.insertionsort;

/**
 * Created by rafael on 29/06/16.
 */
public class insertionSort {

    int[] ordenar(int[] vet) {
        int auxDeTroca, j;
        for (int i = 1; i < vet.length; i++) {
            j = i;
            while (j > 0 && vet[j - 1] > vet[j]) {
                auxDeTroca = vet[j];
                vet[j] = vet[j - 1];
                vet[j - 1] = auxDeTroca;
                j--;
            }
        }
        return vet;

    }
}
