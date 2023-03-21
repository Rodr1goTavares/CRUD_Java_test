package tests;

import javax.swing.*;

public class PolymorphismTest {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", "golden", "auauau");
        dog.run();

        Bird pomb = new Bird("dwa", "dwqdq", "dfew");
        pomb.run();
    }

    static class Animal{
       final private String type;
       final private String color;
       final private String sound;

        public Animal(String type, String color, String sound){
            this.type = type;
            this.sound = sound;
            this.color = color;
        }

        public void sound(){
            System.out.println("Your " + this.type + "'s make " + this.sound);
        }

        public void run(){
            System.out.println("Your " + this.type + " is running !!");
        }

        public void apparence(){
            System.out.println("You " + type + " is " + this.color);
        }
    }

    public static class Bird extends Animal{

        public Bird(String type, String color, String sound) {
            super(type, color, sound);
        }

        public void run(){
            System.out.println("The bird is flying !!");
        }
    }
}
