import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String name = "thequickbrownfoxjumpsoverthelazydog";
        boolean pangram = checkIfPangram(name);
        System.out.println(pangram);

        
    }
public static boolean checkIfPangram(String sentence) {
    boolean[] seen = new boolean[26];
    for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            seen[ch - 'a'] = true;
        }
    }
    for (boolean b : seen) {
        if (!b) return false;
    }
    return true;
}
}
