/**
* Java 1. Homework#3
*
* @author Nikitin Vitaliy
* @version 13.12.2021
*
*/
import java.util.Arrays;

class ThirdDomashka {
    public static void main(String args[]) {
        setArray();
        fillArray();
        setArrayy();


    }

    static void setArray() { // 1 Задание
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                System.out.print ((arr[i]== 0)? "1 " : "0 ");
            }
            System.out.println ();
        }

    static void fillArray() {  // 2 задание
        int[] arr = new int[101];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        System.out.println(Arrays.toString(arr));
        }
        System.out.println ();
    }
    static void setArrayy() {  // 3 задаание
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
        System.out.print ((arr[i]< 6)? arr[i]*2 + " ": arr [i] + " " );
        }
    }
    static void table(String args[]) {
        int[][] table = new int[5][5];
        for (int i = 0; i <table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = 8;
                System.out.print((table[i]==table[j])? "***": table [i]);
            }
            System.out.println();
        }
    }
    static void printArr(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
    }




