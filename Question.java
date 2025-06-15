import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question {
    private static String[] questionBank = {
        "Is the person a male?", // Index 0
        "Is the eye colour brown?", // Index 1
        "Is the eye colour green", // Index 2
        "Is the eye colour blue?", // Index 3
        "Does the person have a light skin tone?", // Index 4
        "Is the hair colour black?", // Index 5
        "Is the hair colour brown?", // Index 6
        "Is the hair colour ginger?", // Index 7
        "Is the hair colour blonde?", // Index 8
        "Is the hair colour white?", // Index 9
        "Does the person have facial hair?", // Index 10
        "Is the person wearing glasses?", // Index 11
        "Does the person have visible teeth?", // Index 12
        "Is the person wearing a hat?", // Index 13
        "Does the person have short hair?", // Index 14
        "Does the person have their hair tied up?", // Index 15
        "Does the person have long hair?", // Index 16
        "Is the person bald?", // Index 17
        "Does the person have ear piercings?" // Index 18
    };

    private static ArrayList<Integer> questionsAsked; // For simplicity, the questions are mapped to specific integer values -> refer to the "Question.java" file for more info.
    private static ArrayList<Boolean> questionResponses; // true = yes, false = no
    private static Set<Integer> aiAskedQuestions = new HashSet<>();
    private static Map<Integer, Integer> aiAttributeTracker = new HashMap<>(); // Question Index:# of Characters With Attribute

    // -=-  Getter Methods  -=-
    /**
     * This method returns the question bank.
     * @return String[] questionBank
     */
    public static String[] getQuestionBank() {
        return questionBank;
    }

    /**
     * This method returns the questions asked list.
     * @return ArrayList<Integer> questionsAsked
     */
    public static ArrayList<Integer> getQuestionsAsked() {
        return questionsAsked;
    }

    /**
     * This method returns the question responses list.
     * @return ArrayList<Integer> questionResponses
     */
    public static ArrayList<Boolean> getQuestionResponses() {
        return questionResponses;
    }

    /**
     * This method returns a hashset of all questions the ai has asked in a game instance.
     * @return Set<Integer> aiAskedQuestions.
     */
    public static Set<Integer> getAiAskedQuestions() {
        return aiAskedQuestions;
    }

    /**
     * This method returns a hashmap of the AI's attrivute tracker.
     * @return Set<Integer> aiAskedQuestions.
     */
    public static Map<Integer, Integer> getAiAttributeTracker() {
        return aiAttributeTracker;
    }

    /**
     * This method returns the question index of the question the AI asked.
     * @return
     */
    public static int getNewAiAskedQuestionIndex() {
        int questionIndex;

        if (GameController.getDifficulty().equals("normal")) {
            questionIndex = (int) (Math.random() * 19);
            while (aiAskedQuestions.contains(questionIndex)) {
                questionIndex = (int) (Math.random() * 19);
            }
        } else {
            questionIndex = 0; // PLACEHOLDER!!!
        }

        aiAskedQuestions.add(questionIndex);

        return questionIndex;
    }

    
    // -=-  Setter Methods  -=-
    /**
     * This method adds the asked question index to the questionsAsked arraylist.
     * @param questionIndex
     */
    public static void addAskedQuestion(int questionIndex) {
        questionsAsked.add(questionIndex);
    }

    /**
     * This method adds the asked question index to the questionsResponses arraylist.
     * @param response
     */
    public static void addAskedQuestion(boolean response) {
        questionResponses.add(response);
    }


    // -=-  Auxillery Methods  -=-
    /**
     * This method returns true or false based on the question the user asks about the AI's character.
     * @param questionIndex
     * @return boolean
     */
    public static String validateUserQuestion(int questionIndex) {
        boolean response = false;

        switch (questionIndex) {
            case 0:
                response = GameController.getAiCharacter().isMale() == true;
                break;
            case 1:
                response = GameController.getAiCharacter().getEyeColour().equals("brown");
                break;
            case 2:
                response = GameController.getAiCharacter().getEyeColour().equals("green");
                break;
            case 3:
                response = GameController.getAiCharacter().getEyeColour().equals("blue");
                break;
            case 4:
                response = GameController.getAiCharacter().isLightSkin() == true;
                break;
            case 5:
                response = GameController.getAiCharacter().getHairColour().equals("black");
                break;
            case 6:
                response = GameController.getAiCharacter().getHairColour().equals("brown");
                break;
            case 7:
                response = GameController.getAiCharacter().getHairColour().equals("ginger");
                break;
            case 8:
                response = GameController.getAiCharacter().getHairColour().equals("blonde");
                break;
            case 9:
                response = GameController.getAiCharacter().getHairColour().equals("white");
                break;
            case 10:
                response = GameController.getAiCharacter().hasFacialHair() == true;
                break;
            case 11:
                response = GameController.getAiCharacter().hasGlasses() == true;
                break;
            case 12:
                response = GameController.getAiCharacter().hasVisibleTeeth() == true;
                break;
            case 13:
                response = GameController.getAiCharacter().hasHat() == true;
                break;
            case 14:
                response = GameController.getAiCharacter().getHairType().equals("short");
                break;
            case 15:
                response = GameController.getAiCharacter().getHairType().equals("tied");
                break;
            case 16:
                response = GameController.getAiCharacter().getHairType().equals("long");
                break;
            case 17:
                response = GameController.getAiCharacter().getHairType().equals("bald");
                break;
            case 18:
                response = GameController.getAiCharacter().hasEarPiercings() == true;
                break;
        }

        if (response) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /**
     * This method returns whether or not the user's guess is correct (if wrong, the game will end right after).
     * @param character
     * @return
     */
    public static String validateUserGuess(String character) {
        if (character.equals(GameController.getAiCharacter().getName())) {
            return "Yes, you win!";
        } else {
            return "No, you lost!";
        }
    }
}