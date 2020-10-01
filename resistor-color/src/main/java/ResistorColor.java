import java.util.Arrays;
import java.util.List;

class ResistorColor {
    private final String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String targetColor) {
        return Arrays.asList(colors).indexOf(targetColor);
    }

    String[] colors() {
        return colors;
    }
}
