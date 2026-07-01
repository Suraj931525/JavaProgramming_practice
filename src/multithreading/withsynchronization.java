package multithreading;

class Busd {
    public synchronized void bus(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x * i);
        }
    }
}

class Passenger1 extends Thread {
    Busd b;

    public Passenger1(Busd b) {
        this.b = b;
    }

    public void run() {
        b.bus(2);
    }
}

class Passenger3 extends Thread {
    Busd b;

    public Passenger3(Busd b) {
        this.b = b;
    }

    public void run() {
        b.bus(4);
    }
}

public class withsynchronization {
    public static void main(String[] args) {

        Busd b = new Busd();

        Passenger1 p1 = new Passenger1(b);
        Passenger3 p2 = new Passenger3(b);

        p1.start();
        p2.start();
    }
}