import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
          // 2-we want to have a gui where we can type in some user information into a dialogue box
        // 3-let store this as a String variable called name
        String name = JOptionPane.showInputDialog("enter your name"); 
        //when we run this we get a small dialog box but it currently doesnt do anything
        //lets create another dialog box with another message
        JOptionPane.showMessageDialog(null, "hello "+name);
        //message dialog box just displays information
        //lets ask for an age by creating an int
        // int age = JOptionPane.showInputDialog("Enter your age");
        //one issue: show input dialog is going to return a string but we are attempting to assign the string to an integer variable
        //to fix this we will use a method . the parse int method. 
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // this will return a string base on what the user types in
        // the parse int method will convert it into an integer that we can store within our integer variable of age
        //we can show it by using another dialog box
        JOptionPane.showMessageDialog(null, "wow youre only..." +age);
    
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // when you use the input dialog box its wanting a string, so you need to convert other data types
        JOptionPane.showMessageDialog(null, "wow youre only..." +height+" inches tall");

        //create a new instance of the trueOrFalse class
        trueOrFalse tfObject = new trueOrFalse();
        tfObject.trueFalseGame();
        //create a new instance of the guessnumber class
        GuessNumber guessObject = new GuessNumber();
        guessObject.guess();

    }
}
