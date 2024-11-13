
package javaapplication1;

    import java.util.*;

public class JavaApplication1 {
    
    public static void main(String[] args) throws Exception{
    
    char charA, charB, charC, charD, charE;
    int score = 0, loop;
    boolean tr = true;
    Scanner scanbot = new Scanner(System.in);
        
        while(tr){
            try {
                System.out.println("1. What is the true color of the sky?");
                System.out.println("A. Blue" + "\nB. Black" 
                        + "\nC. Bluish Purple" + "\nD. Yellow");
                System.out.print("Your answer is: ");
            charA = scanbot.next().charAt(0);
            
            if(charA == 'C' || charA == 'C'){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
                System.out.println("");
                System.out.println("2. It came from cannabis?");
                System.out.println("A. Heroin" + "\nB. Opioids" 
                        + "\nC. Depressants" + "\nD. Marijuana");
                System.out.print("Your answer is: ");
            charB = scanbot.next().charAt(0);

            if(charB == 'D' || charB == 'd'){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
                System.out.println("");
                System.out.println("3. What is the Capital of France?");
                System.out.println("A. Rome" + "\nB. Madrid" 
                        + "\nC. Berlin" + "\nD. Paris");
                System.out.print("Your answer is: ");
            charC = scanbot.next().charAt(0);
            
            if(charC == 'D' || charC == 'd'){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
                System.out.println("");
                System.out.println("4. What is the tallest Mountain? ");
                System.out.println("A. Mt. Pinatubo" + "\nB. Mt. Everest" 
                        + "\nC. Mt. Fuji" + "\nD. Mt. Miñoza");
                System.out.print("Your answer is: ");
            charD = scanbot.next().charAt(0);

            if(charD == 'B' || charD == 'b'){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
                System.out.println("");
                System.out.println("Which chemical elements represents symbol of O");
                System.out.println("A. Gold" + "\nB. Oxygen" 
                        + "\nC. Silver" + "\nD. Bronze");
                System.out.print("Your answer is: ");
            charE = scanbot.next().charAt(0);

            if(charE == 'B' || charE == 'b'){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
            
            System.out.println("Your total score is: " + score);
            
            } catch (Exception e) {
                System.out.println("An error occured: " + e.getMessage());
            }
        System.out.println("Do you want to retake the quiz? (Y)/(N)");
            char okBot = scanbot.next().charAt(0);
            
            if (okBot == 'N' || okBot == 'n'){
                System.out.println("Thank you for taking the quiz!☺");
                return;
            }
        }
    }   
}
