package br.ufms.somaVetRecur;

/**
 * Created by rafael on 30/06/16.
 */
public class Soma {
    int i = 0, soma = 0;

    public int recus(int[] vet) {
        if (i >= vet.length) {
            return soma;
        }
        soma += vet[i];
        i++;
        return recus(vet);
    }

}
