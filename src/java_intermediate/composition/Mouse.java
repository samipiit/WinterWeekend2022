package java_intermediate.composition;

public class Mouse {

    String manufacturer;
    boolean hasScrollWheel;
    boolean isLaser;
    boolean isBall;

    Mouse(String manufacturer, boolean hasScrollWheel, boolean isLaser, boolean isBall) {
        this.manufacturer = manufacturer;
        this.hasScrollWheel = hasScrollWheel;
        this.isLaser = isLaser;
        this.isBall = isBall;
    }

    void leftClick() {
        System.out.println("Left clicking");
    }

    void rightClick() {
        System.out.println("Right clicking");
    }

    void scrollUp() {
        System.out.println("Scrolling up");
    }

    void scrollDown() {
        System.out.println("Scroll down");
    }
}
