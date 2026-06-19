package superkeyword;

class Animal1 {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {

    void sound() {
        super.sound(); // call parent class method
        System.out.println("Dog barks");
    }
}

public class supermethod {

    public static void main(String[] args) {

        Dog1 d = new Dog1();
        d.sound();
    }
}