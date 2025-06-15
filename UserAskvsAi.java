public class UserAskvsAi {

    public static void handleUserQuestion(int questionIndex) {
        //Show the question that user chose
        String question = Question.getQuestionBank()[questionIndex];
        System.out.println("You asked " + question); //dropdown menu somewhere gui 

        //Check if the AIs character has that attribute
        String aiResponse = Question.validateUserQuestion(questionIndex);
        System.out.println("AI says " + aiResponse);

        //FLip characters from the player's board based on the answer
        if (aiResponse.equals("Yes")) {
            flipCharactersNotMatching(questionIndex);  
        } else {
            flipCharactersMatching(questionIndex);   
        }

        //End turn
        System.out.println("Your turn is over. Now it's the AI's turn.");
        //add ai action after this? method idk
    }

    private static void flipCharactersNotMatching(int questionIndex) {
        Character[][] board = GameController.getPlayer1Board();  //User’s board i think
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
        Character[][] board = GameController.getPlayer1Board();
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
