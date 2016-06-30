package br.ufms.selectSort;

/**
 * Created by rafael on 30/06/16.
 */
public class Main {
    public static void main(String a[]) {

        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = Select.doSelectionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
}