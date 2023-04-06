public abstract class Palindrome {

    public static boolean verify(String s1) {
        boolean answer = false;
        String[] strArray = s1.split(" ");
        for(int i = 0; i < strArray.length; i++) {
            StringBuilder sr = new StringBuilder(strArray[i].toLowerCase());
            if (sr.reverse().toString().equals(strArray[i].toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.verify("Anna est un palindrome"));
    }
}
