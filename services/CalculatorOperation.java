package services;

public interface CalculatorOperation<T extends Number> {
    public Double operation(T n1, T n2) throws Exception;
}
