package java_intermediate.data_structures;

import java.util.*;

public class LearnIterator {

    public static void main(String[] args) {

        /*
         Iterator
            Able to traverse Collections objects uni-directionally
            Unable to add/modify elements

         */
//        Map<Integer, String> students = new HashMap<>();
//
//        students.put(7437, "Luc");
//        students.put(20417, "Osama");
//        students.put(20402, "Francesca");
//        students.put(20405, "Hammad");
//        students.put(2131, "Zartasha");
//        students.put(20395, "Abdi");
//
//        Set<Map.Entry<Integer, String>> entrySet = students.entrySet();
//        Iterator studentIter = entrySet.iterator();
//
//        while (studentIter.hasNext()) {
//            System.out.println(studentIter.next());
//        }

        /*
        List Iterator
            Can be used with ONLY List and all List implementations
            Able to traverse bi-directionally
            Able to add/modify elements in the list
         */

        List<String> studentList = new ArrayList<>();
        studentList.add("Luc");
        studentList.add("Osama");
        studentList.add("Francesca");
        studentList.add("Hammad");
        studentList.add("Zartasha");
        studentList.add("Abdi");

        ListIterator<String> studentListIter = studentList.listIterator();

        System.out.println("CURRENT STUDENT LIST");
        while (studentListIter.hasNext()) {
            System.out.println(studentListIter.next());
            studentListIter.set("Ravi");

        }

        System.out.println("\n\nSTUDENT LIST AFTER FORWARD ITERATION");
        for (String student: studentList) {
            System.out.println(student);
        }

        while (studentListIter.hasPrevious()) {
            studentListIter.previous();
            studentListIter.set("Sami");
        }


        System.out.println("\n\nSTUDENT LIST AFTER REVERSE ITERATION");
        for (String student: studentList) {
            System.out.println(student);
        }
    }
}
