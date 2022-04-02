package java_intermediate.data_structures;

public class LearnMultiDimensionalArrays {

    public static void main(String[] args) {
        String[][] arr = new String[2][2];

        arr[0][0] = "Sami";
        arr[0][1] = "Teacher";
        arr[1][0] = "Zohra";
        arr[1][1] = "Student";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
