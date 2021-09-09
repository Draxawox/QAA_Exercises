package exercises;

public class Exercise34ComplexNumber {

    private double real;
    private double imaginary;

    public Exercise34ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Exercise34ComplexNumber num){
        this.real += num.real;
        this.imaginary += num.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(Exercise34ComplexNumber num) {
        this.real -= num.real;
        this.imaginary -= num.imaginary;
    }
}
