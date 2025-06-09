/*
 * File Name: Person.java
 * Authors: Moxin Guo, Victoria Wong, Victor Kwong
 * Description: This file is a class for a person/character of the "Guess Who?" game.
 */

public class Person {
    // -=-  Attributes of a Person  -=-
    private boolean male; // true = male, false = female.
    private String eyeColour; // "brown", "green", or "blue".
    private boolean lightSkin; // true = light skin, false = dark skin.
    private String hairColour; // "black", "brown", "ginger", "blonde", or "white".
    private boolean facialHair; // true = facial hair, false = no facial hair.
    private boolean glasses; // true = glasses, false = no glasses.
    private boolean visibleTeeth; // true = visible teeth, false = no visible teeth.
    private boolean hat; // true = hat, false = no hat.
    private String hairType; // "short", "tied", "long", or "bald".
    private boolean earPiercing; // true = ear piercing, false =  no ear piercing

    private boolean visible; // true = visible (shown in GUI), false = not visible (hidden in GUI)

    /**
     * This is the constructor for the Person class.
     * @param male
     * @param eyeColour
     * @param lightSkin
     * @param hairColour
     * @param facialHair
     * @param glasses
     * @param visibleTeeth
     * @param hat
     * @param hairType
     * @param earPiercing
     */
    public Person(boolean male, String eyeColour, boolean lightSkin, String hairColour, boolean facialHair, boolean glasses, boolean visibleTeeth, boolean hat, String hairType, boolean earPiercing) {
        this.male = male;
        this.eyeColour = eyeColour;
        this.lightSkin = lightSkin;
        this.hairColour = hairColour;
        this.facialHair = facialHair;
        this.glasses = glasses;
        this.visibleTeeth = visibleTeeth;
        this.hat = hat;
        this.hairType = hairType;
        this.earPiercing = earPiercing;

        visible = true;
    }

    
    // -=-  Getter/Accessor Methods  -=-
    /**
     * This method returns whether or not the person is a male.
     * @return boolean "male".
     */
    public boolean isMale() {
        return male;
    }

    /**
     * This method returns the eye colour of the person.
     * @return String "eyeColour".
     */
    public String getEyeColour() {
        return eyeColour;
    }

    /**
     * This method returns whether or not the person has light skin.
     * @return boolean "lightSkin".
     */
    public boolean isLightSkin() {
        return lightSkin;
    }

    /**
     * This method returns the hair colour of the person.
     * @return String "hairColour".
     */
    public String hairColour() {
        return hairColour;
    }

    /**
     * This method returns whether or not the person has facial hair.
     * @return boolean "facialHair".
     */
    public boolean hasFacialHair() {
        return facialHair;
    }

    /**
     * This method returns whether or not the person has glasses.
     * @return boolean "glasses".
     */
    public boolean hasGlasses() {
        return glasses;
    }

    /**
     * This method returns whether or not the person has visible teeth.
     * @return boolean "visibleTeeth".
     */
    public boolean hasVisibleTeeth() {
        return visibleTeeth;
    }

    /**
     * This method returns whether or not the person has a hat.
     * @return boolean "hat".
     */
    public boolean hasHat() {
        return hat;
    }

    /**
     * This method returns the hair type of the person.
     * @return String "hairType".
     */
    public String getHairType() {
        return hairType;
    }

    /**
     * This method returns whether or not the person has ear piercings.
     * @return boolean "earPiercing".
     */
    public boolean hasEarPiercings() {
        return earPiercing;
    }

    /**
     * This method returns whether or not the character is visible (true = visible, false = not visible).
     * @return boolean "visible".
     */
    public boolean getVisibility() {
        return visible;
    }


    // -=-  Setter/Modifier Methods  -=-
    /**
     * This method sets the visibility of the person (true = visible, false = not visible).
     * @param visibility A boolean for whether or not the person is visible.
     */
    public void setVisibility(boolean visibility) {
        visible = visibility;
    }
}