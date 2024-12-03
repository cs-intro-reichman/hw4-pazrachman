public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);

    }

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

    /** If sentences contains str2, returns true; otherwise returns false. */
    public static boolean contains(String sentences, String str2) {
        // Replace the following statement with your code
        sentences = lowerCase(sentences);
        str2 = lowerCase(str2);

        if (sentences.length() == 0) {
            return false;
        }

        if (str2.length() == 0) {
            return true;
        }
        if (str2.length() > sentences.length()) {
            return false;
        }

        for (int i = 0; i < sentences.length() - str2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (sentences.charAt(j + i) != str2.charAt(j)) {
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

    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String lowSentence = lowerCase(sentence);
            for (int r = 0; r < keywords.length; r++) {
                String keyword = keywords[r];
                if (contains(lowSentence, keyword)) {
                    System.out.println(sentence);
                    break;
                }
            }

        }
    }

}
