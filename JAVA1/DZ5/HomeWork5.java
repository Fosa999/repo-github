/**
* Java 1. Homework#5
*
* @author Nikitin Vitaliy
* @version 26.12.2021
*
*/

class HomeWork5 {
    public static void main (String[] args){        
        Person[] persArray = new Person[5]; {
        persArray[0] = new Person("Ivanov Ivan", "QA", "ivivan@mailbox.com", "892314512", 35000, 25);
        persArray[1] = new Person("Potapov Aleksey", "Engineer", "potapov@mailbox.com", "892323312", 450000, 27);
        persArray[2] = new Person("Sidorov Pavel", "Developer", "sidorov@mailbox.com", "892312313", 50000, 30);
        persArray[3] = new Person("Luginin Alexander", "Manager", "luginin@mailbox.com", "892376312", 40000, 43);
        persArray[4] = new Person("Mineev Maksim", "Driver", "mineev@mailbox.com", "892312354", 30000, 45);
        }
        
        for (int i=0; i < 5; i++) {
            if (persArray[i].getAge() > 40) {
                 System.out.println (persArray[i]);
            }
        }
    }
}

class Person{
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;
    
    
    Person(String name, String position, String email, String number, int salary,  int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
        }

    @Override
    public String toString() {
        return (name + ", " 
        + position + ", " 
        + email + ", " 
        + number + ", " 
        + salary + ", " 
        + age);
    }
}


