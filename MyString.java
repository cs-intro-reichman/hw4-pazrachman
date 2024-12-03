public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String strTemp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                strTemp += (char) (str.charAt(i) + 32); // adds 32 acording to aski
            } else {
                strTemp += ch; // add latters that are lower cases
            }
        }
        return strTemp;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        if (str1.length() == 0) {
            return false;
        }

        if (str2.length() == 0) {
            return true;
        }
        if (str2.length() > str1.length()) {
            return false;
        }

        for (int i = 0; i < str1.length() - str2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(j + i) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }

        return false;
    }
}
