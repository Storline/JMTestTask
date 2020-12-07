package Solutions;
import java.io.IOException;


public class Calculator {
    public static void main(String[] args) throws IOException {
        Calculations calc = new Calculations();
        System.out.println("Введите уравнение типа " + "\"2 + 2\"");
        calc.calc();
    }
}



