import services.ServiceCalculator;

public class Main {
    public static void main(String[] args) throws Exception {

        ServiceCalculator calc = new ServiceCalculator<Double>();
        System.out.println(calc.division(5, 2));
    }
}
