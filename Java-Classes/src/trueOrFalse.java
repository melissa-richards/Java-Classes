//import our library
import javax.swing.JOptionPane;

//lets make a class to hold our true or false game
public class trueOrFalse {
        //Define the method
        public void trueFalseGame(){
            //use a while loop until the user chooses YES
            while(JOptionPane.showConfirmDialog(null, "is this your fav class?", "is this your fav class", JOptionPane.YES_NO_OPTION) !=0){
            //create amessage to display when they are wrong
                JOptionPane.showMessageDialog(null, "oh no youre wrong");
            }
            //create a message to display when they are right
            JOptionPane.showMessageDialog(null, "there we go! good job");
        }
}
