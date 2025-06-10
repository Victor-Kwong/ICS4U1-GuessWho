public class Character {
    String name;
    String gender;
    String eyeColour;
    String hairColour;
    boolean skinTone; // should skin tone be a boolean or string bc the question just asks if they have a light skin tone 
    boolean hasFacialHair;
    boolean hasGlasses;
    boolean hasVisibleTeeth;
    boolean hasHat;
    String hairLength;
    boolean hasPiercings;
    boolean isVisible = true;

    public boolean matchesTrait(String trait, String value) {
        if (trait.equalsIgnoreCase("gender")) return gender.equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("eyecolour")) return eyeColour.equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("skintone")) return skinTone.equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("haircolour")) return hairColour.equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("facialhair")) return String.valueOf(hasFacialHair).equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("glasses")) return String.valueOf(hasGlasses).equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("teeth")) return String.valueOf(hasVisibleTeeth).equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("hat")) return String.valueOf(hasHat).equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("hairlength")) return hairLength.equalsIgnoreCase(value);
        if (trait.equalsIgnoreCase("piercings")) return String.valueOf(hasPiercings).equalsIgnoreCase(value);

        return false;
    }
}

