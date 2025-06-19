package br.com.javainsider.other.innerclass.staticnested;

public class App1 {

    public static void main(String[] args) {

        Operation op = new Operation(5,7);
        int result = op.sum();
        op.sum();
        System.out.println(result);

        System.out.println(op.getCounter().getValue());
    }
}
