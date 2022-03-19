package java_intermediate.oops.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        LearnEncapsulation obj1 = new LearnEncapsulation();
        LearnEncapsulation obj2 = new LearnEncapsulation();
        LearnEncapsulation obj3 = new LearnEncapsulation();
        LearnEncapsulation obj4 = new LearnEncapsulation();
        LearnEncapsulation obj5 = new LearnEncapsulation();

        obj5.setSalary(90000);
        obj3.setSalary(70000);
        obj1.setSalary(50000);
        obj4.setSalary(80000);
        obj2.setSalary(60000);

        System.out.println(obj5.getSalary());
        System.out.println(obj4.getSalary());
        System.out.println(obj3.getSalary());
        System.out.println(obj2.getSalary());
        System.out.println(obj1.getSalary());
    }

}
