public class CalculatorLogger {
    public void logOperation(String operation, ComplexNumber result) {
        System.out.println("Operation: " + operation + " Result: " + result.getReal() + " + " + result.getlmaginary() + "i");
    }
}