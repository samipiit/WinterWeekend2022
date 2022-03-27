package java_intermediate.data_structures;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 57;
        myArray[9] = 183;

        List<String> studentNames = new ArrayList();

        studentNames.add("Aghiles");
        studentNames.add("Gaurav");
        studentNames.add("Zohra");
        studentNames.add("Zartasha");
        studentNames.add("Anteneh");

        int length = studentNames.size();
        System.out.println("LENGTH OF ARRAYLIST: " + length);

        String name = studentNames.get(4);
        System.out.println("VALUE AT INDEX 4: " + name);

        studentNames.add("Sonia");
        name = studentNames.get(5);
        System.out.println("VALUE AT INDEX 5: " + name);

        boolean doesListContain = studentNames.contains("Sami");
        System.out.println(doesListContain);

        System.out.println();
        List<String> subList = studentNames.subList(2, 5);
        for (String s : subList) {
            System.out.println(s);
        }

        subList.clear();

    }



}
