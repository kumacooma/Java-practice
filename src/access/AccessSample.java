package access;

public class AccessSample {
    private int number = 1;
    int number2 = 2;
    protected int number3 = 3;
    public int number4 = 4;

    void printNumber() {
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }
}