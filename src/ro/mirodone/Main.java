package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        NextBigger nextBigger = new NextBigger();

        char[] digits = {'5', '3', '4', '9', '7', '6'};
        int n = digits.length;
        nextBigger.findNext(digits, n);


    }
}
