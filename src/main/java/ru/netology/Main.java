package ru.netology;

public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculatorAdaptor();

        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sub(10, 22));
        System.out.println(intsCalc.div(100, 22));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));

        System.out.println(intsCalc.div(100, 0));
        System.out.println(intsCalc.sub(10, 10));
    }
}
