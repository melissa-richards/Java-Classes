import javax.swing.JOptionPane;

public class GuessNumber {
    
        public void guess() throws Exception{
        // Display message asking the user to guess a number
        String message = "Guess a number between 1 and 100: ";
        String title = "Put your Guess here!";
        int guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));

        // Loop until the user gets the correct answer
        while (guess!= 50) {
            // Check if the guess is higher or lower than the actual number
            if (guess > 50) {
                message = "Your guess is too high. Try again: ";
            } else if (guess < 50) {
                message = "Your guess is too low. Try again: ";
            }

            // Read the user's next guess
            guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));
        }

        // Display a message congratulating the user
        message = "Congratulations! You got it. The number was 50.";
        JOptionPane.showMessageDialog(null, message);

        }
}