package br.com.javainsider.other.lambda;

public class Calculator {
    private int mult;

    int calculate(int x, int y){
        mult = 2;
        Operation operation = (n1, n2) -> (n1 + n2) * mult;
        return operation.calculate(x, y);
    }
}
