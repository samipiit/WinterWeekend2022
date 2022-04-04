package java_intermediate.data_structures;

public class LearnMultiDimensionalArrays {

    public static void main(String[] args) {
        String[][] arr = new String[3][3];

        arr[0][0] = "Gaurav";
        arr[0][1] = "Yahya";
        arr[0][2] = "Zain";
        arr[1][0] = "Abdi";
        arr[1][1] = "Roman";
        arr[1][2] = "Sufian";
        arr[2][0] = "Hammad";
        arr[2][1] = "Parnel";
        arr[2][2] = "Kamrun";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
