package ru.netology;

public class IntsCalculatorAdaptor implements Ints {

    protected Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        return (int)calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int)calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int)calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }

    @Override
    public int div(int a, int b) {
        return (int)calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
    }

    @Override
    public int sub(int a, int b) {

        return (int)calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result();
    }
}
