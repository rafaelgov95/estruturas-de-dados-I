package br.ufms.insertionsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rafael on 29/06/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        insertionSort ordenainsert = new insertionSort();
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        int tam = Integer.parseInt(leia.readLine());
        int[] vet = new int[tam];
        System.out.println("Insira um vetor de numeros desordenados");
        for (int i = 0; i < tam ; i++) {
            vet[i] = Integer.parseInt(leia.readLine());
        }
        ordenainsert.ordenar(vet);
        for (int i = 0; i < tam; i++) {
            System.out.println(vet[i] + " ");
        }
    }
}
