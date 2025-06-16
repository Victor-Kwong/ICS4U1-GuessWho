import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    // -=-  Character Set Up  -=-
    // (isMale, eyeColour, hasLightSkin, hairColour, hasFacialHair, hasGlasses, hasVisibleTeeth, hasHat, hairType, hasEarPiercings)
    /*static Person sam = new Person("Sam", true, "green", false, "black", false, false, false, true, "short", false, "Character Images\\sam.png");
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
    static Person mia = new Person("Mia", false, "brown", false, "black", false, false, true, false, "long", false, "Character Images\\mia.png");*/

    // -=-  Other Game Setup Variables  -=-
    private static ArrayList<Person> characters;

    static Person[][] player1Board; // Player 1 will ALWAYS be an actual user, and NEVER an AI!

    private static String difficulty = "normal"; // Normal or Hard.

    private static int turnTracker; // 1 = Player 1's turn, 2 = Player 2's turn.

    private static ArrayList<Person> aiCharacterList = new ArrayList<>();
    private static Person aiCharacter; // The character that the AI randomly selects.


    // -=-  Getter Methods  -=-
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

    /**
     * This method returns the AI's character.
     * @return Person aiCharacter
     */
    public static Person getAiCharacter() {
        return aiCharacter;
    }

    /**
     * This method returns the AI's character list.
     * @return ArrayList<Person> aiCharacterList
     */
    public static ArrayList<Person> getAiCharacterList() {
        return aiCharacterList;
    }


    // -=- Setter Methods  -=-
    /**
     * This method sets the difficulty of the new game.
     * @param difficulty
     */
    public static void setDifficulty(String level) {
        difficulty = level;
    }

    /**
     * This method returns whose turn it is.
     * @param turn
     */
    public static void setTurn(int turn) {
        turnTracker = turn;
    }

    /**
     * This method sets the AI's character to a random one.
     */
    public static void setAiCharacter() {
        aiCharacter = player1Board[(int) (Math.random() * 4)][(int) (Math.random() * 6)];
    }

    // -=-  Auxillery Methods  -=-
    /**
     * This method reads all the character attributes from a text file to create new objects each game instance.
     * @throws IOException
     */
    public static void createNewCharacterList() throws IOException {
        characters = new ArrayList<>();

        Scanner fileReader = new Scanner(new File("characterAttributes.txt"));

        while (fileReader.hasNextLine()) {
            String name = fileReader.nextLine();
            boolean isMale = fileReader.nextBoolean();
            fileReader.nextLine();
            String eyeColour = fileReader.nextLine();
            boolean isLightSkin = fileReader.nextBoolean();
            fileReader.nextLine();
            String hairColour = fileReader.nextLine();
            boolean hasFacialHair = fileReader.nextBoolean();
            boolean hasGlasses = fileReader.nextBoolean();
            boolean hasVisibleTeeth = fileReader.nextBoolean();
            boolean hasHat = fileReader.nextBoolean();
            fileReader.nextLine();
            String hairType = fileReader.nextLine();
            boolean hasEarPiercings = fileReader.nextBoolean();
            fileReader.nextLine();
            fileReader.nextLine();

            characters.add(new Person(name, isMale, eyeColour, isLightSkin, hairColour, hasFacialHair, hasGlasses, hasVisibleTeeth, hasHat, hairType, hasEarPiercings));
        }
        
        fileReader.close();
    }

    /**
     * This method resets all players' boards to the default values.
     * @throws IOException 
     */
    public static void resetPlayerBoardsToDefault() throws IOException {
        createNewCharacterList();
        player1Board = new Person[4][6];

        int counter = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                player1Board[row][col] = characters.get(counter);
                counter++;
            }
        }
    }

    /**
     * This method randomly chooses which player goes first.
     */
    public static void chooseRandomFirstTurn() {
        double randNum = Math.random();
        turnTracker = (int) (Math.round(randNum) + 1);
    }

    /**
     * This method resets all values to their default values for a new game instance.
     * @throws IOException 
     */
    public static void newGame() throws IOException {
        resetPlayerBoardsToDefault();
        setAiCharacter();

        aiCharacterList = new ArrayList<>();
        for (Person person : characters) {
            aiCharacterList.add(person);
        }

        if ((Question.getQuestionsAsked() != null) && (Question.getQuestionResponses() != null) && (Question.getAiAskedQuestions() != null) && (Question.getAiAttributeTracker() != null)) {
            Question.getQuestionsAsked().clear();
            Question.getQuestionResponses().clear();
            Question.getAiAskedQuestions().clear();
            Question.getAiAttributeTracker().clear();
        }

        Question.getAiAttributeTracker().put(0, 12); // Ex: Question Index 0 ("Is the person a male?"):12 People With This Attribute
        Question.getAiAttributeTracker().put(1, 13);
        Question.getAiAttributeTracker().put(2, 6);
        Question.getAiAttributeTracker().put(3, 5);
        Question.getAiAttributeTracker().put(4, 11);
        Question.getAiAttributeTracker().put(5, 10);
        Question.getAiAttributeTracker().put(6, 4);
        Question.getAiAttributeTracker().put(7, 2);
        Question.getAiAttributeTracker().put(8, 3);
        Question.getAiAttributeTracker().put(9, 5);
        Question.getAiAttributeTracker().put(10, 6);
        Question.getAiAttributeTracker().put(11, 6);
        Question.getAiAttributeTracker().put(12, 10);
        Question.getAiAttributeTracker().put(13, 5);
        Question.getAiAttributeTracker().put(14, 12);
        Question.getAiAttributeTracker().put(15, 5);
        Question.getAiAttributeTracker().put(16, 5);
        Question.getAiAttributeTracker().put(17, 2);
        Question.getAiAttributeTracker().put(18, 7);
    }

    public static void updateAiValidCharactersList(boolean response, int questionIndex) {
        ArrayList<Person> removingCharacters = new ArrayList<>();

        switch (questionIndex) {
            case 0: // "Is the person a male?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.isMale()) { // Remove all females.
                            removingCharacters.add(character);
                        } else if (!response && character.isMale()) { // Remove all males.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 1: // "Is the eye colour brown?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getEyeColour().equals("brown")) { // Remove all non brown eyed people.
                            removingCharacters.add(character);
                        } else if (!response && character.getEyeColour().equals("brown")) { // Remove all brown eyed people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 2: // "Is the eye colour green?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getEyeColour().equals("green")) { // Remove all non green eyed people.
                            removingCharacters.add(character);
                        } else if (!response && character.getEyeColour().equals("green")) { // Remove all green eyed people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 3: // "Is the eye colour blue?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getEyeColour().equals("blue")) { // Remove all non blue eyed people.
                            removingCharacters.add(character);
                        } else if (!response && character.getEyeColour().equals("blue")) { // Remove all blue eyed people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 4: // "Does the person have a light skin tone?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.isLightSkin()) { // Remove all dark skin toned people.
                            removingCharacters.add(character);
                        } else if (!response && character.isLightSkin()) { // Remove all light skin toned people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 5: // "Is the hair colour black?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairColour().equals("black")) { // Remove all non black haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairColour().equals("black")) { // Remove all black haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 6: // "Is the hair colour brown?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairColour().equals("brown")) { // Remove all non brown haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairColour().equals("brown")) { // Remove all brown haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 7: // "Is the hair colour ginger?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairColour().equals("ginger")) { // Remove all non ginger haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairColour().equals("ginger")) { // Remove all ginger haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 8: // "Is the hair colour blonde?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairColour().equals("blonde")) { // Remove all non blonde haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairColour().equals("blonde")) { // Remove all blonde haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 9: // "Is the hair colour white?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairColour().equals("white")) { // Remove all non white haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairColour().equals("white")) { // Remove all white haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 10: // "Does the person have facial hair?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.hasFacialHair()) { // Remove all non facial haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.hasFacialHair()) { // Remove all facial haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 11: // "Is the person wearing glasses?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.hasGlasses()) { // Remove all people without glasses
                            removingCharacters.add(character);
                        } else if (!response && character.hasGlasses()) { // Remove all people with glasses.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 12: // "Does the person have visible teeth?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.hasVisibleTeeth()) { // Remove all people without visible teeth.
                            removingCharacters.add(character);
                        } else if (!response && character.hasVisibleTeeth()) { // Remove all people with visible teeth.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 13: // "Is the person wearing a hat?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.hasHat()) { // Remove all people without hats.
                            removingCharacters.add(character);
                        } else if (!response && character.hasHat()) { // Remove all people with hats.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 14: // "Does the person have short hair?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairType().equals("short")) { // Remove all non short haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairType().equals("short")) { // Remove all short haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 15: // "Does the person have their hair tied up?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairType().equals("tied")) { // Remove all non tied hair people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairType().equals("tied")) { // Remove all tied hair people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 16: // "Does the person have long hair?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairType().equals("long")) { // Remove all non long haired people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairType().equals("long")) { // Remove all long haired people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 17: // "Is the person bald?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.getHairType().equals("bald")) { // Remove all non bald people.
                            removingCharacters.add(character);
                        } else if (!response && character.getHairType().equals("bald")) { // Remove all bald people.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
            case 18: // "Does the person have ear piercings?"
                for (int i = 0; i < aiCharacterList.size(); i++) {
                    Person character = aiCharacterList.get(i);

                    if (character.getVisibility()) { // If character is not "hidden".
                        if (response && !character.hasEarPiercings()) { // Remove all people without ear piercings.
                            removingCharacters.add(character);
                        } else if (!response && character.hasEarPiercings()) { // Remove all people with ear piercings.
                            removingCharacters.add(character);
                        }
                    }
                }

                break;
        }

        for (Person person : removingCharacters) {
            aiCharacterList.remove(person);
        }
    }
}