package JUnitTest.JUnit.Exercises.TDD;

public class PasswordValidator {
    private String password = "";

    public void setPassword(String password) {
        char[] pass =  password.toCharArray();
        int countDigits = 0;
        boolean upperCase = false;
        for(int i = 0; i < pass.length; i++){
            if(Character.isDigit(pass[i])) {
                countDigits++;
            }
            else if(Character.isUpperCase(pass[i])){
                upperCase = true;
            }
        }
        if(countDigits >= 2 && upperCase)
            this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
    }
}
