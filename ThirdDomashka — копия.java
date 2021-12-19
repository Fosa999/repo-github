/**
* Java 1. Homework#3
*
* @author Nikitin Vitaliy
* @version 19.12.2021 03:05
*
*/
import java.util.Arrays;

class ThirdDomashka {
    public static void main(String args[]) {
        setArray();
        fillArray();
        setArrayy();
        table();
        System.out.println(Arrays.toString(writeMethod(6, 10)));
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
        for (int i = 0; i < 101; i++) {
            arr[i] = i;
        System.out.print(i+ " ");
        }
        System.out.println ();
    }
    
    static void setArrayy() {  // 3 задаание
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
        System.out.print ((arr[i]< 6)? arr[i]*2 + " ": arr [i] + " " );
        }
        System.out.println();
        
    }
    
    static void table(){ // 4 задание
       int[][] table = new int[5][5];
        for (int i = 0; i <table.length; i++) {
            for (int j = 0; j <table.length; j++) {
                System.out.print((table[i]==table[j])? "*": "0");
            }
            System.out.println();
        }
    }
    static void printArr(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table [i][j]);
            }
            System.out.println();
        }
    }
    
    static int[] writeMethod(int a , int b) { // a - len  b -initialValue  // 5 Задание
    int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b;
        }
        return arr;
    }
}