/**
* Java 1. Homework#6
*
* @author Nikitin Vitaliy
* @version 27.12.2021
*
*/

class Lesson6 {
    public static void main (String[] args){
        Cat cat = new Cat("Barsik", 200, 0);
        Dog dog = new Dog("Bobik", 500, 10);
        IAnimal[] animals = {cat, dog};
            for (IAnimal a : animals) {
                System.out.println(a);
                System.out.println(a.run(150));
                System.out.println(a.swim(13));
                System.out.println(a.run(750));
                System.out.println(a.swim(10));
            }
    }
}