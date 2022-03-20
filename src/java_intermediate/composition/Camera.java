package java_intermediate.composition;

public class Camera {

    String manufacturer;
    String resolution;
    boolean isOn;
    boolean isBuiltIn;

    public Camera(String manufacturer, String resolution, boolean isBuiltIn) {
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.isBuiltIn = isBuiltIn;
        this.isOn = false;
    }

    void takePicture() {
        System.out.println("SNAP!");
    }

    void zoomIn() {
        System.out.println("Zooming in");
    }

    void zoomOut() {
        System.out.println("Zooming out");
    }
}
