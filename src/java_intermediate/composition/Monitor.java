package java_intermediate.composition;

public class Monitor {

    String manufacturer;
    String resolution;
    int screenSize;
    boolean isCurved;
    int volLevel;

    Monitor(String manufacturer, String resolution, int screenSize, boolean isCurved) {
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.isCurved = isCurved;
        this.volLevel = 0;
    }

    void powerOn() {
        System.out.println(this.manufacturer + " monitor is powering on");
    }

    void powerOff() {
        System.out.println(this.manufacturer + " monitor is powering off");
    }

    void sleep() {
        System.out.println(this.manufacturer + " monitor is going to sleep");
    }

    void increaseVol(int increaseBy) {
        int maxVol = 100;

        if ((this.volLevel + increaseBy) <= maxVol) {

            for (int i = this.volLevel; i <= this.volLevel + increaseBy; i++) {
                System.out.println("Volume is " + i);
            }

            this.volLevel = this.volLevel + increaseBy;
            System.out.println("Volume is set to " + this.volLevel);
        } else {
            System.out.println("\nCURRENT VOLUME: " + this.volLevel + "\nMAX VOLUME: " + maxVol + "\nUNABLE TO INCREASE " +
                    "BY " + increaseBy);
        }
    }

    void decreaseVol(int decreaseBy) {
        int minVol = 0;

        if ((this.volLevel - decreaseBy) >= 0) {

            for (int i = this.volLevel; i >= this.volLevel - decreaseBy; i--) {
                System.out.println("Volume is " + i);
            }

            this.volLevel = this.volLevel - decreaseBy;
            System.out.println("Volume is set to " + this.volLevel);
        } else {
            System.out.println("\nCURRENT VOLUME: " + this.volLevel + "\nMIN VOLUME: " + minVol + "\nUNABLE TO DECREASE " +
                    "BY " + decreaseBy);
        }

    }
}
