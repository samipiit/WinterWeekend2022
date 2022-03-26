package java_intermediate.oops.abstraction;

class LearnAbstractionChild extends LearnAbstraction implements FederalReserve, FederalReserve2, FederalReserve3 {

    public static void main(String[] args) {

        System.out.println(FederalReserve.fedFundsRate); // 5.4
        System.out.println(FederalReserve2.altFedRate); // 5.8
        System.out.println(FederalReserve3.altFedRate); // 6.32
    }

    @Override
    void doSomething() {
        System.out.println("Doing something");
    }

    @Override
    boolean isThisTrue() {
        return true;
    }

    @Override
    public void printName() {

    }

    @Override
    public void printNameAgain() {

    }

    @Override
    public void printNameOnceMore() {

    }
}
