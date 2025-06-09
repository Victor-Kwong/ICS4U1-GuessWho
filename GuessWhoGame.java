public class GuessWhoGame {
    public static void main(String[] args) {
        characterSetup();
    }

    public static void characterSetup() {
        // -=-  Character Set Up  -=-
        // (isMale, eyeColour, hasLightSkin, hairColour, hasFacialHair, hasGlasses, hasVisibleTeeth, hasHat, hairType, hasEarPiercings)
        Person sam = new Person(true, "green", false, "black", false, false, false, true, "short", false);
        Person olivia = new Person(false, "brown", false, "black", false, false, false, false, "tied", false);
        Person nick = new Person(true, "brown", true, "blonde", false, false, false, false, "short", true);
        Person david = new Person(true, "brown", true, "blonde", true, false, true, true, "short", false);
        Person sofia = new Person(false, "green", false, "brown", false, false, true, false, "short", true);
        Person liz = new Person(false, "blue", true, "white", false, true, true, false, "long", false);
        Person lily = new Person(false, "green", false, "brown", false, false, true, true, "long", false);
        Person leo = new Person(true, "brown", false, "white", true, false, true, false, "short", false);
        Person emma = new Person(false, "brown", true, "ginger", false, false, false, false, "tied", false);
        Person daniel = new Person(true, "green", true, "ginger", true, false, false, false, "tied", false);
        Person ben = new Person(true, "brown", true, "brown", false, true, false, false, "short", true);
        Person katie = new Person(false, "blue", true, "blonde", false, false, false, true, "tied", false);
        Person al = new Person(true, "green", false, "white", true, true, false, false, "bald", false);
        Person amy = new Person(false, "brown", true, "black", false, true, false, false, "short", false);
        Person mike = new Person(true, "brown", true, "black", false, false, true, true, "short", false);
        Person gabe = new Person(true, "brown", false, "black", false, false, false, false, "short", false);
        Person farah = new Person(false, "blue", false, "black", false, false, false, false, "tied", false);
        Person laura = new Person(false, "green", false, "black", false, false, true, false, "long", true);
        Person jordan = new Person(true, "brown", false, "black", true, false, false, false, "short", true);
        Person eric = new Person(true, "blue", true, "black", false, false, false, false, "short", false);
        Person carmen = new Person(false, "brown", false, "white", false, false, true, false, "short", true);
        Person rachel = new Person(false, "blue", true, "brown", false, true, false, false, "long", true);
        Person joe = new Person(true, "brown", false, "white", true, true, true, false, "bald", false);
        Person mia = new Person(false, "brown", false, "black", false, false, true, false, "long", false);
    }
}