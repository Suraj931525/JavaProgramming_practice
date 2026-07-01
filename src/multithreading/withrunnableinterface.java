package multithreading;


class Racing implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Start racing - Lap " + i);
        }
    }
}


class Score implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Score display - Round " + i);
        }
    }
}


class Finish implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("End racing - Step " + i);
        }
    }
}

public class withrunnableinterface {
    public static void main(String[] args) {

       
        Racing r1 = new Racing();
        Score r2 = new Score();
        Finish r3 = new Finish();

       
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread finished execution");
    }
}