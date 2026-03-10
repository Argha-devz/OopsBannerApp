/**
 * OOPSBannerApp
 * 
 * Use Case 1 (UC1): Print literal text "OOPS" to the console.
 * 
 * @author Chinmay
 * @version 1.0
 */
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Function to build pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int rows = map.get(word.charAt(0)).length;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = map.get(c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}