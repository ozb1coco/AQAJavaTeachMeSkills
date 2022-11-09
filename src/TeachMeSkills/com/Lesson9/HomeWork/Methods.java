package TeachMeSkills.com.Lesson9.HomeWork;

public class Methods {
    public boolean polindromWords(String word) {
        char[] words = word.toCharArray();
        int wordLength = word.length();
        for (int i = 0; i < wordLength / 2; i++) {
            if (words[i] != words[wordLength - i - 1]) {
                return false;
            }
        }
        return true;
    }
    public void printWordFrom3to5Symbols(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3 && words[i].length() <= 5) {
                System.out.println(words[i]);
            }
        }
    }
    public void minWord(String text) {
        String[] words = text.split(" ");
        String minWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (minWord.length() > words[i].length()) {
                minWord = words[i];
            }
        }
        System.out.println("min word is: " + minWord);
    }
    public void maxWord(String text) {
        String[] words = text.split(" ");
        String maxWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (maxWord.length() < words[i].length()) {
                maxWord = words[i];
            }
        }
        System.out.println("Max word is: " + maxWord);
    }
    public void createWordWithTwoHalfEvenWords() {
        String str1 = "MAMATA";
        String str2 = "PAPAGA";
        if (str1.toCharArray().length % 2 == 0 && str2.toCharArray().length % 2 == 0) {
            System.out.println("1st word = " + str1);
            System.out.println("2nd word = " + str2);
            String str3 = (str1.substring(0, str1.length() / 2)) +
                    (str2.substring(str2.length() / 2));
            System.out.println(str3);
        } else {
            System.out.println("Wrong word parametrs need even.");
        }
    }
}
