package java_intermediate.practice_exercises;

public class StringReverse {

    static String sentence = "We are learning how to reverse strings. Can you figure it out?";
                            //?tuo ti erugif uoy naC .sgnirts esrever ot woh gninrael era eW

    public static void main(String[] args) {

        char[] sentenceArray = sentence.toCharArray();
        int n = sentenceArray.length;

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(sentenceArray[i]);
        }

    }
}
