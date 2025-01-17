package pscsess;

public class UncheckedException {
    
    public static int divide(int a, int b) {
        try {
            return a / b;  
        } catch (ArithmeticException e) {  
            System.out.println("Cannot divide by zero");
            return 0;  
        }
    }
    
    public static void main(String[] args) {
        
        int result1 = divide(10, 2);  
        System.out.println("Result of 10 / 2: " + result1);
        
        int result2 = divide(10, 0);  
        System.out.println("Result of 10 / 0: " + result2);
    }
}
