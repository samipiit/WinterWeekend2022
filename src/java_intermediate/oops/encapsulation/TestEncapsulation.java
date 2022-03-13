package java_intermediate.oops.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        LearnEncapsulation obj = new LearnEncapsulation();

        int salary = obj.getSalary();
        System.out.println(salary);

        obj.setSalary(1000000);

        salary = obj.getSalary();
        System.out.println(salary);
    }
}
