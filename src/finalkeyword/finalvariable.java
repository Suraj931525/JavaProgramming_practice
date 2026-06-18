package finalkeyword;

class Student {

    final int x = 10;

    void display() {
        System.out.println("Value of x = " + x);

        // x = 20; // Compile-time Error
    }
}

public class finalvariable {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
    }
}