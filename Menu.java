import java.util.Scanner;
public class Menu {
    private static boolean againstAI, againstPlayer = false;
    private static boolean difficultyNormal, difficultyNightmare = false;
    private static int choiceGameMode, choiceDifficulty = 0;
    
    
    // These will all be buttons in our GUI

    public static void main (String args){
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Please choose a Gamemode!");
        System.out.println("<1> Against AI\t<2> Against Player");
        choiceGameMode = sc.nextInt(); 

        // Only ask them for a difficulty when they play against a AI
        if (choiceGameMode == 1){
            againstAI = true;
            System.out.println("Please choose a difficulty!");
            System.out.println("<1> Normal\t<2> Nightmare");
            choiceDifficulty = sc.nextInt();

            if (choiceDifficulty == 1){
                difficultyNormal = true;
            }

            else if (choiceDifficulty == 2){
                difficultyNightmare = true;
            }

            else{
                System.out.println("You did not enter a valid option.");
            }
        }

        else if (choiceGameMode == 2){
            againstPlayer = true;
        }

        else{
            System.out.println("You did not enter a valid option.");
        }
    }
    
}
