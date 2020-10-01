import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PangramChecker {
    private static final HashSet<String> alphabet_set =
            "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(Character::toString)
                    .collect(Collectors.toCollection(HashSet::new));

    public boolean isPangram(String str) {
        HashSet<String> str_set =
                str.chars().mapToObj(c -> Character.toString(c).toLowerCase())
                        .collect(Collectors.toCollection(HashSet::new));
        return str_set.containsAll(alphabet_set);
    }

}
