import java.util.logging.Logger;

public class ComplexNumCalc {
    Log loger = new Log();
    Logger log = loger.Loger();

    public ComplexNumber sum(ComplexNumber compNum_1, ComplexNumber compNum_2) {
        log.info("method call sum." + compNum_1.toString() + " + " +
                compNum_2.toString());

        double realSum = compNum_1.getReal() + compNum_2.getReal();

        double imaginerySum = compNum_1.getImaginary() + compNum_2.getImaginary();

        log.info("Method call sum completed.");
        return new ComplexNumber(realSum, imaginerySum);
    }

    public ComplexNumber multiply(ComplexNumber compNum_1, ComplexNumber compNum_2) {
        log.info("method call multiply. " + compNum_1.toString() + " * " +
                compNum_2.toString());

        double realProduct = (compNum_1.getReal() * compNum_2.getReal())
                - (compNum_1.getImaginary() * compNum_2.getImaginary());

        double imagineryProduct = (compNum_1.getReal() * compNum_2.getImaginary())
                + (compNum_1.getImaginary() * compNum_2.getReal());

        log.info("Method call multiply completed.");
        return new ComplexNumber(realProduct, imagineryProduct);
    }

    public ComplexNumber divide(ComplexNumber compNum_1, ComplexNumber compNum_2) {
        log.info("method call divide. " + compNum_1.toString() + " / " +
                compNum_2.toString());

        double denominator = (compNum_2.getReal() * compNum_2.getReal())
                + (compNum_2.getImaginary() * compNum_2.getImaginary());

        double realQuotient = ((compNum_1.getReal() * compNum_2.getReal())
                + (compNum_1.getImaginary() * compNum_2.getImaginary())) / denominator;

        double imagineryQuotient = ((compNum_1.getImaginary() * compNum_2.getReal())
                - (compNum_1.getReal() * compNum_2.getImaginary())) / denominator;

        log.info("Method call divide completed.");
        return new ComplexNumber(realQuotient, imagineryQuotient);
    }
}
