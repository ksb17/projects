/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] array) {
        boolean isSorted;
        for (var i = 0; i < array.length; i++) {
            isSorted = true;
            for (var j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                    //System.out.println(Arrays.toString(array));
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int array[] = {30, 15, 10, 40, 25, 20, 12};
        System.out.println(Arrays.toString(array));
        bs.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
