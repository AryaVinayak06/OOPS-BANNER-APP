public class OopsBannerApp{
    public static void main(String[] args) {

        // Create character mappings
        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                "  **   **  ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                "  **   **  ",
                "   ***   "
        });

        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[]{
                " ******  ",
                " **    ** ",
                " **    ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        });

        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[]{
                "  ****** ",
                " **      ",
                " **      ",
                "   ****  ",
                "      ** ",
                "      ** ",
                " ******  "
        });

        // Word to render
        CharacterPatternMap[] word = {
                letterO, letterO, letterP, letterS
        };

        // Render banner
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                lineBuilder.append(cp.getPattern()[i]).append("   ");
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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
}