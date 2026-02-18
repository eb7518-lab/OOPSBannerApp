public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] lines = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            lines[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
            "  ***   ",
            " *   *  ",
            " *   *  ",
            " *   *  ",
            "  ***   "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
            " *****  ",
            " *    * ",
            " *****  ",
            " *      ",
            " *      "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            " *     ",
            " ***** ",
            "     * ",
            " ***** "
        };
    }
}

