import java.util.ArrayList;

public class GameController {
    // -=-  Character Set Up  -=-
    // (isMale, eyeColour, hasLightSkin, hairColour, hasFacialHair, hasGlasses, hasVisibleTeeth, hasHat, hairType, hasEarPiercings)
    static Person sam = new Person("Sam", true, "green", false, "black", false, false, false, true, "short", false, "Character Images\\sam.png");
    static Person olivia = new Person("Olivia", false, "brown", false, "black", false, false, false, false, "tied", false, "Character Images\\olivia.png");
    static Person nick = new Person("Nick", true, "brown", true, "blonde", false, false, false, false, "short", true, "Character Images\\nick.png");
    static Person david = new Person("David", true, "brown", true, "blonde", true, false, true, true, "short", false, "Character Images\\david.png");
    static Person sofia = new Person("Sofia", false, "green", false, "brown", false, false, true, false, "short", true, "Character Images\\sofia.png");
    static Person liz = new Person("Liz", false, "blue", true, "white", false, true, true, false, "long", false, "Character Images\\liz.png");
    static Person lily = new Person("Lily", false, "green", false, "brown", false, false, true, true, "long", false, "Character Images\\lily.png");
    static Person leo = new Person("Leo", true, "brown", false, "white", true, false, true, false, "short", false, "Character Images\\leo.png");
    static Person emma = new Person("Emma", false, "brown", true, "ginger", false, false, false, false, "tied", false, "Character Images\\emma.png");
    static Person daniel = new Person("Daniel", true, "green", true, "ginger", true, false, false, false, "tied", false, "Character Images\\daniel.png");
    static Person ben = new Person("Ben", true, "brown", true, "brown", false, true, false, false, "short", true, "Character Images\\ben.png");
    static Person katie = new Person("Katie", false, "blue", true, "blonde", false, false, false, true, "tied", false, "Character Images\\katie.png");
    static Person al = new Person("Al", true, "green", false, "white", true, true, false, false, "bald", false, "Character Images\\al.png");
    static Person amy = new Person("Amy", false, "brown", true, "black", false, true, false, false, "short", false, "Character Images\\amy.png");
    static Person mike = new Person("Mike", true, "brown", true, "black", false, false, true, true, "short", false, "Character Images\\mike.png");
    static Person gabe = new Person("Gabe", true, "brown", false, "black", false, false, false, false, "short", false, "Character Images\\gabe.png");
    static Person farah = new Person("Farah", false, "blue", false, "black", false, false, false, false, "tied", false, "Character Images\\farah.png");
    static Person laura = new Person("Laura", false, "green", false, "black", false, false, true, false, "long", true, "Character Images\\jordan.png");
    static Person jordan = new Person("Jordan", true, "brown", false, "black", true, false, false, false, "short", true, "Character Images\\laura.png");
    static Person eric = new Person("Eric", true, "blue", true, "black", false, false, false, false, "short", false, "Character Images\\eric.png");
    static Person carmen = new Person("Carmen", false, "brown", false, "white", false, false, true, false, "short", true, "Character Images\\carmen.png");
    static Person rachel = new Person("Rachel", false, "blue", true, "brown", false, true, false, false, "long", true, "Character Images\\rachel.png");
    static Person joe = new Person("Joe", true, "brown", false, "white", true, true, true, false, "bald", false, "Character Images\\joe.png");
    static Person mia = new Person("Mia", false, "brown", false, "black", false, false, true, false, "long", false, "Character Images\\mia.png");

    // -=-  Other Game Setup Variables  -=-
    private static final Person[][] defaultBoard = { // The default board of a player which all new boards will be referencing from.
        {sam, olivia, nick, david, sofia, liz},
        {lily, leo, emma, daniel, ben, katie},
        {al, amy, mike, gabe, farah, jordan},
        {laura, eric, carmen, rachel, joe, mia}
    };

    static Person[][] player1Board; // Player 1 will ALWAYS be an actual user, and NEVER an AI!
    static Person[][] player2Board; // Player 2 will be either an AI or a user (if we add player vs player).

    private static String difficulty = "normal"; // Normal or Hard.

    private static int turnTracker; // 1 = Player 1's turn, 2 = Player 2's turn.


    // -=-  Getter Methods  -=-
    /**
     * This method returns the default board of the game.
     * @return Person[][]
     */
    public Person[][] getDefaultBoard() {
        return defaultBoard;
    }

    /**
     * This method returns the difficulty of the game.
     * @return String difficulty
     */
    public static String getDifficulty() {
        return difficulty;
    }

    /**
     * This method returns whose turn it is (1 for player 1, and 2 for ai or [maybe] second user).
     * @return String turn
     */
    public static int getTurn() {
        return turnTracker;
    }


    // -=- Setter Methods  -=-
    /**
     * This method sets the difficulty of the new game.
     * @param difficulty
     */
    public static void setDifficulty(String difficulty) {
        GameController.difficulty = difficulty;
    }

    /**
     * This method returns whose turn it is.
     * @param turn
     */
    public static void setTurn(int turn) {
        GameController.turnTracker = turn;
    }

    // -=-  Auxillery Methods  -=-
    /**
     * This method resets all players' boards to the default values.
     */
    public static void resetPlayerBoardsToDefault() {
        player1Board = new Person[4][6];
        player2Board = new Person[4][6];

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                player1Board[row][col] = defaultBoard[row][col];
                player2Board[row][col] = defaultBoard[row][col];
            }
        }
    }

    public static void chooseRandomFirstTurn() {
        int randNum = (int) Math.round(Math.random());

        turnTracker = randNum + 1;
    }
}
