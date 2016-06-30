package br.ufms.buscaBinaria;

/**
 * Created by rafael on 29/06/16.
 */
public class buscaBinaria {
    public int busca(int buscado, int[] vet) {
        int low = 0;
        int high = vet.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (vet[mid] == buscado) return mid;
            if (vet[mid] < buscado) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
