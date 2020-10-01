import java.util.*;

class ResistorColorDuo {
    private static final HashMap<String, Integer> COLORS = new HashMap<>()
    {{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);
    }};

    public int value(String[] colors) {
        int res = 0;

        for (int i = 0; i < 2; i++) {
            res = 10 * res + COLORS.get(colors[i]);
        }

        return res;
        }

}
