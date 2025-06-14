import java.util.ArrayList;
import java.util.HashSet;
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
        "Does the person have ear piercings?"  // Index 18
    };

    private static ArrayList<Integer> questionsAsked; // For simplicity, the questions are mapped to specific integer values -> refer to the "Question.java" file for more info.
    private static ArrayList<Boolean> questionResponses; // true = yes, false = no
    private static Set<Integer> aiAskedQuestions = new HashSet<>();

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

    /**
     * This method resets all values to their default values for a new game instance.
     */
    public static void resetToDefault() {
        if ((questionsAsked != null) && (questionResponses != null) && (aiAskedQuestions != null)) {
            questionsAsked.clear();
            questionResponses.clear();
            aiAskedQuestions.clear();
        }
    }
}
