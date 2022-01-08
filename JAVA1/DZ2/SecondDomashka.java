/**
* Java 1. Homework#2
*
* @author Nikitin Vitaliy
* @version 13.12.2021
*
*/
class SecondDomashka {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 6));
        findNumber(-6);
        System.out.println(identifySign(4));
        writeLine (3,4);
    }
    
    static boolean checkSum(int a, int b) { //Задание 1 длинный вариант решения
        int sum = a + b;
        if (21 > sum || sum > 10) {
            return true;
            } else {
            return false;
        }
    }
//    static boolean checkSum(int a, int b) { //Задание 1 короткий вариант
//        return a + b>10 ||  21< a + b;
//    }
    
    static void findNumber(int a) { //Задание 2
        System.out.println ((a>= 0)? "Positive number" : "Negative number");
    }
    
    static boolean identifySign(int a) { //Задание 3
        return a>=0;
    }
    
    static void writeLine(int a, int b) { //Задание 4
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
