package java_intermediate.composition;

public class Keyboard {

    String manufacturer;
    String color;
    boolean hasNumPad;
    boolean hasBacklights;
    boolean isMechanical;

    public Keyboard(String manufacturer, String color, boolean hasNumPad, boolean hasBacklights, boolean isMechanical) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.hasNumPad = hasNumPad;
        this.hasBacklights = hasBacklights;
        this.isMechanical = isMechanical;
    }

    void enableBacklights() {
        System.out.println("Backlights are on");
    }

    void disableBacklights() {
        System.out.println("Backlights are off");
    }

    void enableNumLock() {
        System.out.println("Num Lock is on");
    }

    void disableNumLock() {
        System.out.println("Num Lock is off");
    }
}
