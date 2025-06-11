public class GuessWhoGame {
    // -=-  Character Set Up  -=-
    // (isMale, eyeColour, hasLightSkin, hairColour, hasFacialHair, hasGlasses, hasVisibleTeeth, hasHat, hairType, hasEarPiercings)
    static Person sam = new Person(true, "green", false, "black", false, false, false, true, "short", false);
    static Person olivia = new Person(false, "brown", false, "black", false, false, false, false, "tied", false);
    static Person nick = new Person(true, "brown", true, "blonde", false, false, false, false, "short", true);
    static Person david = new Person(true, "brown", true, "blonde", true, false, true, true, "short", false);
    static Person sofia = new Person(false, "green", false, "brown", false, false, true, false, "short", true);
    static Person liz = new Person(false, "blue", true, "white", false, true, true, false, "long", false);
    static Person lily = new Person(false, "green", false, "brown", false, false, true, true, "long", false);
    static Person leo = new Person(true, "brown", false, "white", true, false, true, false, "short", false);
    static Person emma = new Person(false, "brown", true, "ginger", false, false, false, false, "tied", false);
    static Person daniel = new Person(true, "green", true, "ginger", true, false, false, false, "tied", false);
    static Person ben = new Person(true, "brown", true, "brown", false, true, false, false, "short", true);
    static Person katie = new Person(false, "blue", true, "blonde", false, false, false, true, "tied", false);
    static Person al = new Person(true, "green", false, "white", true, true, false, false, "bald", false);
    static Person amy = new Person(false, "brown", true, "black", false, true, false, false, "short", false);
    static Person mike = new Person(true, "brown", true, "black", false, false, true, true, "short", false);
    static Person gabe = new Person(true, "brown", false, "black", false, false, false, false, "short", false);
    static Person farah = new Person(false, "blue", false, "black", false, false, false, false, "tied", false);
    static Person laura = new Person(false, "green", false, "black", false, false, true, false, "long", true);
    static Person jordan = new Person(true, "brown", false, "black", true, false, false, false, "short", true);
    static Person eric = new Person(true, "blue", true, "black", false, false, false, false, "short", false);
    static Person carmen = new Person(false, "brown", false, "white", false, false, true, false, "short", true);
    static Person rachel = new Person(false, "blue", true, "brown", false, true, false, false, "long", true);
    static Person joe = new Person(true, "brown", false, "white", true, true, true, false, "bald", false);
    static Person mia = new Person(false, "brown", false, "black", false, false, true, false, "long", false);

    private static Person[][] defaultBoard = {
        {sam, olivia, nick, david, sofia, liz},
        {lily, leo, emma, daniel, ben, katie},
        {al, amy, mike, gabe, farah, laura},
        {jordan, eric, carmen, rachel, joe, mia}
    };

    public static void main(String[] args) {
        new GUI();
    }
}