class FirstDomashka {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = 11;
        System.out.println ((a + b >= 0)? "Sum positive" : "Sum negative");
    }

    static void printColor() {
        int value = 0;
        if (value > 100) {
            System.out.println("Green");
        }
        if (value >0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value <= 0) {
            System.out.println("Red");
        }
    }

    static void compareNumbers() {
        int a = 3;
        int b = 4;
        System.out.println((a>=b)? "a >= b" : "a < b");
    }
}
