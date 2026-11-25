
public class PasswordChecker {
    public int getLength(String password) {
        int passwordLength = password.length();
        return password.length();
    }

public boolean hasUppercase (String password){
        for (int i =0; i<password.length(); i++ ){
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
      }
public boolean hasLowercase (String password){
       for (int i = 0; i <password.length(); i++){
           char c = password.charAt(i);
           if (Character.isLowerCase(c)){
               return true;
           }
        }
       return false;
       }
public boolean hasDigit(String password) {
    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        if (Character.isDigit(c)) {
            return true;
        }
    }
    return false;
}
public boolean hasSpecial(String password) {
        for (int i = 0; i< password.length(); i++) {
            char c = password.charAt(i);
            if(! Character.isLetterOrDigit(c))
                return true;
        }
        return false;
}
public int getScore (String password) {
        int score =0;

        if (hasUppercase(password)){
            score++;
        }
        if (hasLowercase(password)){
            score++;
        }
        if (hasDigit(password)){
            score++;
        }
        if (hasSpecial(password)){
            score++;
        }
        if (getLength(password) >= 8) {
            score++;
        }
        return score;
}
public String getStrength (String password) {
        int score = getScore(password);

        if (score <= 2) {
            return "WEAK";
        }
        if (score <= 4) {
            return "MEDIUM";
        }
        if (score <= 5) {
            return "STRONG";
        }
    return password;
}
}
