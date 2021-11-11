package main;



public class lesson6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", "black", 200,0),
                new Dog("Bobik", "brown",500,10),
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
            animals[i].swim(10);
        }
    }
}

