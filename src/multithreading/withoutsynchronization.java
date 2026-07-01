package multithreading;

class Bus {
    public void bus(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x * i);
        }
    }
}

class Passenger extends Thread {
    Bus b;

    public Passenger(Bus b) {
        this.b = b;
    }

    public void run() {
        b.bus(2);
    }
}

class Passenger2 extends Thread {
    Bus b;

    public Passenger2(Bus b) {
        this.b = b;
    }

    public void run() {
        b.bus(4);
    }
}

public class withoutsynchronization {
    public static void main(String[] args) {

        Bus b = new Bus();

        Passenger p1 = new Passenger(b);
        Passenger2 p2 = new Passenger2(b);

        p1.start();
        p2.start();
    }
}