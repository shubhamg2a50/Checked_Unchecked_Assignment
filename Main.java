package pscsess;

public class Main {
    public static void main(String[] args) {
        try {
           
            AgeVerification.verifyAge(20);  
         
            AgeVerification.verifyAge(16);  
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());  
        }
    }
}

