import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static Map<Character, String[]> buildCharacterPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            "  ***   ",
            " *   *  ",
            " *   *  ",
            " *   *  ",
            "  ***   "
        });

        map.put('P', new String[]{
            " *****  ",
            " *    * ",
            " *****  ",
            " *      ",
            " *      "
        });

        map.put('S', new String[]{
            " ***** ",
            " *     ",
            " ***** ",
            "     * ",
            " ***** "
        });

        return map;
    }

    public static void renderBanner(String word, Map<Character, String[]> map) {
        int rows = map.get(word.charAt(0)).length;

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                sb.append(map.get(word.charAt(j))[i]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = buildCharacterPatterns();
        renderBanner("OOPS", patterns);
    }
}