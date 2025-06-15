public class AiTurn {

    public static void handleAiTurn() {
        System.out.println("AI's Turn");

        int questionIndex = Question.getNewAiAskedQuestionIndex();
        String question = Question.getQuestionBank()[questionIndex];
        System.out.println("AI asks " + question);

        //does USER's character has the attribute
        boolean userResponse = validateAiQuestionAgainstUser(questionIndex);
        System.out.println("You respond " + (userResponse ? "Yes" : "No"));

        //Ai board filter
        if (userResponse) {
            flipCharactersNotMatching(questionIndex);  //Remove characters that don't match
        } else {
            flipCharactersMatching(questionIndex);     
        }

        System.out.println("AI turn ends. It's your turn now.");
    }

    private static boolean validateAiQuestionAgainstUser(int questionIndex) {
        Character userCharacter = GameController.getUserCharacter(); //i dont think we have this getter in gamecontroller class yet, need to add 
        switch (questionIndex) {
            case 0: return userCharacter.isMale();
            case 1: return userCharacter.getEyeColour().equals("brown");
            case 2: return userCharacter.getEyeColour().equals("green");
            case 3: return userCharacter.getEyeColour().equals("blue");
            case 4: return userCharacter.isLightSkin();
            case 5: return userCharacter.getHairColour().equals("black");
            case 6: return userCharacter.getHairColour().equals("brown");
            case 7: return userCharacter.getHairColour().equals("ginger");
            case 8: return userCharacter.getHairColour().equals("blonde");
            case 9: return userCharacter.getHairColour().equals("white");
            case 10: return userCharacter.hasFacialHair();
            case 11: return userCharacter.hasGlasses();
            case 12: return userCharacter.hasVisibleTeeth();
            case 13: return userCharacter.hasHat();
            case 14: return userCharacter.getHairType().equals("short");
            case 15: return userCharacter.getHairType().equals("tied");
            case 16: return userCharacter.getHairType().equals("long");
            case 17: return userCharacter.getHairType().equals("bald");
            case 18: return userCharacter.hasEarPiercings();
            default: return false;
        }
    }

    private static void flipCharactersNotMatching(int questionIndex) {
        Character[][] board = GameController.getplayer2Board(); // AI's board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                Character c = board[i][j];
                if (c != null && !c.isFlipped() && !c.hasAttribute(questionIndex)) {
                    c.flip();
                }
            }
        }
    }

    private static void flipCharactersMatching(int questionIndex) {
        Character[][] board = GameController.getplayer2Board(); // AI's board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                Character c = board[i][j];
                if (c != null && !c.isFlipped() && c.hasAttribute(questionIndex)) {
                    c.flip();
                }
            }
        }
    }
}

