import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String charWord = sc.next();
        int k = sc.nextInt();

        StringBuffer cipherString = new StringBuffer();

        for(int i =0; i< charWord.length(); i++) {
            char cipherChar = cipherChar(charWord.charAt(i), k);

            cipherString.append(cipherChar);
        }

        System.out.println("Word = " + charWord + "\nCipherWord="+ cipherString);
    }

    public static char cipherChar(char letter, int k) {
        if(!Character.isAlphabetic(letter))
            return letter;
        int base = Character.isLowerCase(letter) ? 'a' : 'A';
        char cipherChar  = (char) ((letter + k - base) % 26  + base);

        return cipherChar;
    }
}
