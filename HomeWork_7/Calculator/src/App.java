public class App {
    public static void main(String[] args) throws Exception {
        ComplexNumCalc calc = new ComplexNumCalc();
        ViewCalculator view = new ViewCalculator(calc);
        view.run();
    }
}
