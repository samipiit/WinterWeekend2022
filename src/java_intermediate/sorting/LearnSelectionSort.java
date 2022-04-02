package java_intermediate.sorting;

public class LearnSelectionSort {

    public static void main(String[] args) {
        int[] unorderedArray = new int[100];
        int length = unorderedArray.length;

        for (int i = 0; i < length; i++) {
            unorderedArray[i] = (int)(Math.random() * (Math.random() * 100));
        }

        System.out.println("UNORDERED");
        for (int x : unorderedArray) {
            System.out.println(x);
        }

        int lowestNumberIndex;
        int temp;

        for (int i = 0; i < length - 1; i++) {
            lowestNumberIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (unorderedArray[j] < unorderedArray[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }

            temp = unorderedArray[i];
            unorderedArray[i] = unorderedArray[lowestNumberIndex];
            unorderedArray[lowestNumberIndex] = temp;
        }

        System.out.println("\nORDERED");
        for (int x : unorderedArray) {
            System.out.println(x);
        }




    }
}
