package java_intermediate.fileIO.xlsx_files;

import java.io.IOException;

public class LearnExcelFileIO {

    public static void main(String[] args) {
        DataReader dr = new DataReader();

        String filePath = System.getProperty("user.dir") + "\\src\\java_intermediate\\fileIO\\xlsx_files\\data\\StudentData.xlsx";
        String sheetName = "Students";

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


        try {
            dr.writeStringArrays(arr, filePath, sheetName);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        String[][] data;
        try {
            data = dr.readStringArrays(filePath, sheetName);

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    System.out.println(data[i][j]);
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
