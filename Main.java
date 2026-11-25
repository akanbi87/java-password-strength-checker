import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        PasswordChecker passwordChecker = new PasswordChecker();
        boolean hasUpper = passwordChecker.hasUppercase(password);
        boolean hasLower = passwordChecker.hasLowercase(password);
        boolean hasDigit = passwordChecker.hasDigit(password);
        boolean hasSpecial = passwordChecker.hasSpecial(password);

        System.out.println("Has upperCase: "+hasUpper);
        System.out.println("Has lowerCase: "+hasLower);
        System.out.println("Has digit: " +hasDigit);
        System.out.println("Has special character: " +hasSpecial);

        int length = passwordChecker.getLength(password);
        System.out.println("Length: "+ length);
        int score = passwordChecker.getScore(password);
        System.out.println("Score: "+score);
        String strength = passwordChecker.getStrength(password);
        System.out.println("Strength: "+ strength);
    }
}
1