
public class Reverse {
    public static void main(String[] args) {
        
        //input the string
        String inputSentence = "Java is an object oriented language";

        String reversedSentence = reverseWords(inputSentence);

        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    // Function to reverse the words in a sentence
    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder reversedSentence = new StringBuilder();

        // Reverse and append each word to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
//Output:
/*PS C:\Users\brije\OneDrive\Documents\noob>  & 'C:\Users\brije\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\brije\AppData\Roaming\Code\User\workspaceStorage\447a19b93fc2999aab1b0c2e28708398\redhat.java\jdt_ws\noob_d6de1f5c\bin' 'Reverse' 
Original Sentence: Java is an object oriented language
Reversed Sentence: language oriented object an is Java */