
import java.util.Scanner;

public class ViewCalculator {

    private ComplexNumCalc calculator;

    public ViewCalculator(ComplexNumCalc calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {

            double real = promptDouble("Введите вещественное число 1го комплексного числа: ");
            double imaginary = promptDouble("Введите мнимое число 1го комплексного числа: ");

            ComplexNumber compNum_1 = new ComplexNumber(real, imaginary);

            ComplexNumber res = compNum_1;
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {

                    real = promptDouble("Введите вещественное число 2го комплексного числа: ");
                    imaginary = promptDouble("Введите мнимое число 2го комплексного числа: ");
                    ComplexNumber compNum_2 = new ComplexNumber(real, imaginary);

                    res = calculator.multiply(compNum_1, compNum_2);
                    compNum_1 = res;

                    continue;
                }
                if (cmd.equals("+")) {

                    real = promptDouble("Введите вещественное число 2го комплексного числа: ");
                    imaginary = promptDouble("Введите мнимое число 2го комплексного числа: ");
                    ComplexNumber compNum_2 = new ComplexNumber(real, imaginary);
                    res = calculator.sum(compNum_1, compNum_2);
                    compNum_1 = res;
                    continue;
                }
                if (cmd.equals("/")) {
                    real = promptDouble("Введите вещественное число 2го комплексного числа: ");
                    imaginary = promptDouble("Введите мнимое число 2го комплексного числа: ");
                    ComplexNumber compNum_2 = new ComplexNumber(real, imaginary);
                    res = calculator.divide(compNum_1, compNum_2);
                    compNum_1 = res;
                    break;
                }
                if (cmd.equals("=")) {
                    System.out.println(res.toString());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
