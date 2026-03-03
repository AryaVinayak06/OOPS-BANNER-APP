public class OopsBannerApp{
    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = letterO[i] + "   "
                      + letterO[i] + "   "
                      + letterP[i] + "   "
                      + letterS[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    private static String[] buildO() {
        return new String[]{
                "   ***   ",
                "  **   **  ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                "  **   **  ",
                "   ***   "
        };
    }

    private static String[] buildP() {
        return new String[]{
                " ******  ",
                " **    ** ",
                " **    ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        };
    }

    private static String[] buildS() {
        return new String[]{
                "  ****** ",
                " **      ",
                " **      ",
                "   ****  ",
                "      ** ",
                "      ** ",
                " ******  "
        };
    }
}