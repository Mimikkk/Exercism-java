import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RnaTranscription {
    private static final HashMap<Character, Character> translation = new HashMap<>()
    {{
        put('G','C');
        put('C','G');
        put('T','A');
        put('A','U');
    }};

    String transcribe(String dnaStrand) {
        // "ACGT" -> "UGCA"
        return dnaStrand.chars().mapToObj(c->translation.get(((char) c)).toString()).collect(Collectors.joining(""));
    }

}
