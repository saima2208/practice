public class Password {
    public static void main(String[] args) {
        int length = 8; // Length of the password
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // Randomly decide the type of character to add
            double random = Math.random();
            if (random < 0.25) {
                password.append(getRandomLowerCaseLetter());
            } else if (random < 0.5) {
                password.append(getRandomUpperCaseLetter());
            } else if (random < 0.75) {
                password.append(getRandomDigitCharacter());
            } else {
                password.append(getRandomSpecialCharacter());
            }
        }

        System.out.println("Generated Password: " + password);
    }

    // Method to generate a random character between two characters
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Method to generate a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Method to generate a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Method to generate a random digit
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Method to generate a random special character (e.g., !, @, #, etc.)
    public static char getRandomSpecialCharacter() {
        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+'};
        int index = (int) (Math.random() * specialCharacters.length);
        return specialCharacters [index];
    }

}

