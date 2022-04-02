//package java_intermediate.fileIO.xlsx_files;
//
//import java.io.IOException;
//
//public class LearnExcelFileIO {
//
//    public static void main(String[] args) {
//        DataReader dr = new DataReader();
//
//        String filePath = System.getProperty("user.dir") + "\\src\\java_intermediate\\fileIO\\xlsx_files\\data\\StudentData.xlsx";
//        String sheetName = "Students";
//
//        String[][] data;
//
//        try {
//            data = dr.fileReaderArrayStringArraysXSSF(filePath, sheetName);
//
//            for (int i = 0; i < data.length; i++) {
//                for (int j = 0; j < data[i].length; j++) {
//                    System.out.println(data[i][j]);
//                }
//            }
//
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
//    }
//}
