package br.ufms.buscaBinaria;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rafael on 29/06/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        buscaBinaria buscarBinaria = new buscaBinaria();
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("informe o tamanho do vetor");
        int tam = Integer.parseInt(leia.readLine());
        System.out.println("informe o numero a ser buscado");
        int valorx = Integer.parseInt(leia.readLine());
        int[] vet = new int[tam];
        System.out.println("Insira um vetor de numeros ordenados");
        for (int i = 0; i < tam; i++) {
            vet[i] = Integer.parseInt(leia.readLine());
        }
        System.out.println(buscarBinaria.busca(valorx, vet));
    }
}
