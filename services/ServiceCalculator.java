package services;

public class ServiceCalculator <T extends Number> {

    public double summa(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    
}