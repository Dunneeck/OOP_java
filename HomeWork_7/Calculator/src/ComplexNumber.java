class ComplexNumber {
    private double real;
    private double imaginary;
     
    public ComplexNumber(double real, double imaginery) {
    this.real = real;
    this.imaginary = imaginery;
}

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginery) {
        this.imaginary = imaginery;
    }

    @Override
    public String toString(){
         return (imaginary >= 0) ? String.format("(%.1f + %.1fi)",real, imaginary) : String.format("(%.1f% .1fi)",real, imaginary);
    }
}