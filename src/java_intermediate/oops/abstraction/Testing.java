package java_intermediate.oops.abstraction;

public class Testing {

    public static void main(String[] args) {

        /*
        While we can't instantiate an abstract class, we can use the abstract class to define the data type of the ref,
            and instantiate a child of the abstract class
         */
        LearnAbstraction obj = new LearnAbstractionChild();
        System.out.println(obj.isThisTrue());

    }


}
