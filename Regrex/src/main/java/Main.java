import com.khanhnhb.match_vowels.MatchVowels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input string: ");
        String str = sc.nextLine();

        System.out.println(MatchVowels.matchConsonanceVowelConsonance(str));
    }
}
