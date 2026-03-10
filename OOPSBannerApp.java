/**
 * OOPSBannerApp
 * 
 * Use Case 1 (UC1): Print literal text "OOPS" to the console.
 * 
 * @author Chinmay
 * @version 1.0
 */
public class OOPSBannerApp {

    // Static method for O
    public static String[] buildO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Static method for P
    public static String[] buildP() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Static method for S
    public static String[] buildS() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}