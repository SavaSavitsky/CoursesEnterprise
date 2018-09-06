package Test.One;

import java.util.*;
import java.util.stream.Collectors;

/*Write a program to find all distinct words from a text file. Ignore chars like ".,/-;:" and
        Ignore case sensitivity.*/

public class App01 {
    private static Set finishedText(String regularExpressions, String yourFile) {
        if (yourFile != null || regularExpressions != null) {
            List<String> stringInfo = new ArrayList<>();
            while (new Scanner(yourFile).hasNextLine()) {
                stringInfo.add(new Scanner(yourFile).nextLine());
            }
            return stringInfo.stream()
                    .flatMap(t -> Arrays.stream(t.split(" ")))
                    .filter(t -> !t.matches(regularExpressions))
                    .collect(Collectors.toCollection(HashSet::new));
        } else {
            throw new NullPointerException();
        }
    }
}
