public class OOPSBannerApp {

    public static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPattern getCharacterPattern(char ch) {
        if (ch == 'O') {
            return new CharacterPattern('O', new String[]{
                "  ***   ",
                " *   *  ",
                " *   *  ",
                " *   *  ",
                "  ***   "
            });
        } else if (ch == 'P') {
            return new CharacterPattern('P', new String[]{
                " *****  ",
                " *    * ",
                " *****  ",
                " *      ",
                " *      "
            });
        } else if (ch == 'S') {
            return new CharacterPattern('S', new String[]{
                " ***** ",
                " *     ",
                " ***** ",
                "     * ",
                " ***** "
            });
        }
        return null;
    }

    public static void main(String[] args) {

        CharacterPattern[] patterns = {
            getCharacterPattern('O'),
            getCharacterPattern('O'),
            getCharacterPattern('P'),
            getCharacterPattern('S')
        };

        int rows = patterns[0].getPattern().length;
        String[] lines = new String[rows];

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                sb.append(cp.getPattern()[i]).append(" ");
            }

            lines[i] = sb.toString();
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}