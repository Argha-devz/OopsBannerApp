/**
 * OOPSBannerApp
 * 
 * Use Case 1 (UC1): Print literal text "OOPS" to the console.
 * 
 * @author Chinmay
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
    String[] banner = {

    String.join("    ", "*****", "*****", "******", "*****"),
    String.join("    ", "*   *", "*   *", "*   *", "*"),
    String.join("    ", "*   *", "*   *", "*   *", "*"),
    String.join("    ", "*   *", "*   *", "******", "*****"),
    String.join("    ", "*   *", "*   *", "*", "*"),
    String.join("    ", "*   *", "*   *", "*", "*"),
    String.join("    ", "*****", "*****", "*", "*****")

};
for (String line : banner) {
    System.out.println(line);
}
    }
}