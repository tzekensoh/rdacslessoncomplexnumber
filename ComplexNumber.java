public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber n)
    {
        ComplexNumber result = new ComplexNumber(this.realPart + n.getRealPart(),
                this.imaginaryPart + n.getImaginaryPart());
        return result;
    }

    public ComplexNumber subtract(ComplexNumber n)
    {
        ComplexNumber result = new ComplexNumber(this.realPart - n.getRealPart(),
                this.imaginaryPart - n.getImaginaryPart());
        return result;
    }

    public ComplexNumber multiply(ComplexNumber n)
    {
        double resultRealPart = this.realPart * n.getRealPart() - this.imaginaryPart * n.getImaginaryPart();
        double resultImaginaryPart = this.realPart * n.getImaginaryPart() + this.imaginaryPart * n.getRealPart();
        ComplexNumber result = new ComplexNumber(resultRealPart, resultImaginaryPart);
        return result;
    }

    /**
     * Divide a complex number by a real number n.
     * May implement complex number division in the future
     * @param n
     * @return the result of division
     */
    public ComplexNumber divide(double n)
    {
        ComplexNumber result = new ComplexNumber(this.realPart / n,
                this.imaginaryPart / n);
        return result;
    }

    @Override
    public String toString() {
        return
                realPart +
                " + " + imaginaryPart +
                'i';
    }
}
