package java_intermediate.database;

import java.sql.SQLException;
import java.util.List;

public class TestDatabase {

    public static void main(String[] args) throws Exception {
        Database db = new Database();
        String query = "SELECT COUNT(*) FROM EMPLOYEES WHERE FIRST_NAME = \"GEORGI\"";
        List<String> count = db.executeQueryReadAllSingleColumn(query, 1);

        for (String x : count) {
            System.out.println(x);
        }

//        List<List<String>> data = db.executeQueryReadAll(query);
//
//        for (List<String> row : data) {
//            for (String cell : row) {
//                System.out.print(cell + "\t\t");
//            }
//            System.out.println("\n");
//        }

    }

}
