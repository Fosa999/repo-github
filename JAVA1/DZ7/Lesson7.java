class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsik", 5), new Cat("Vaska", 8), new Cat("Kotik", 6),
        };
        Plate plate = new Plate(10);
        System.out.println(plate);
        
        for(Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(15);
        System.out.println(plate);
        
        for(Cat cat : cats) {
            cat.setSaturation(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}