package pscsess;

public class AgeVerification {

    public static void verifyAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");  
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}


