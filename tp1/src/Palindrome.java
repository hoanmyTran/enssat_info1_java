import java.text.Normalizer;

public abstract class Palindrome {

    public static boolean verify(String s) {
        String[] strArray = s.split(" ");
        for(int i = 0; i < strArray.length; i++) {
            StringBuilder str = new StringBuilder(strArray[i].toLowerCase());
            if (str.toString().equals(str.reverse().toString())) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyV2(String s) {
        StringBuilder str = new StringBuilder(Palindrome.removeAccent(s.toLowerCase().trim().replaceAll("\\s", "")));
        return str.toString().equals(str.reverse().toString());
    }

    public static String removeAccent(String s) {
        return Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.verify("Anna est un palindrome"));
        System.out.println(Palindrome.verify("anna est un palindrome"));
        System.out.println(Palindrome.verifyV2("élu par cette crapule"));
        System.out.println(Palindrome.verifyV2("ésope reste ici et se repose"));
    }
}
