import java.util.Arrays;

class ResistorColor {
    String[] colors = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String targetColor) {
        int index = Arrays.binarySearch(this.colors, targetColor);
        return (index < 0) ? -1 : index + 1;
    }

    String[] colors() {
        return colors.clone();
    }
}
