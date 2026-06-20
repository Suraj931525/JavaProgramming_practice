package encapsulation;

class SBIBank1 {
    private int amount;

    public void setter(int x) {
        amount = x;
    }

    public int getter() {
        return amount;
    }
}

public class demo1 {

    public static void main(String[] args) {

        SBIBank1 s1 = new SBIBank1();

        s1.setter(10000);

        System.out.println(s1.getter());
    }
}