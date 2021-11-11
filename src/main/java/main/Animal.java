package main;

public class Animal {
    protected String name;
    protected String color;
    protected int run;
    protected int swim;



    public Animal(String name, String color,int run,int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;


    }
    public void run(int distance) {
        if (run >= distance) {
            System.out.println(name + " " + "running distance" + " " + distance);
        } else System.out.println(name + " " + "could not run" + " " + distance);

    }
    public void swim(int distance) {
        if (swim >= distance) {
            System.out.println(name + " " + "swimming distance" + " " + distance);
        } else System.out.println(name + " " + "could not swim" + " " + distance);
    }
}


