import java.util.Arrays;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final int strength = ability();
    private final int dexterity = ability();
    private final int constitution = ability();
    private final int intelligence = ability();
    private final int wisdom = ability();
    private final int charisma = ability();

    static int ability() {
        int[] rolls = new Random().ints(4, 1, 7).toArray();
        int min = Arrays.stream(rolls).min().orElse(-1);

        return Arrays.stream(rolls).sum() - min;
    }

    int modifier(int mod) {
        return Math.floorDiv(mod-10, 2);
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }
}
