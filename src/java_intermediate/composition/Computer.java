package java_intermediate.composition;

public class Computer {

    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;
    Camera camera;

    Computer(Monitor monitor, Keyboard keyboard, Mouse mouse, Camera camera) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.camera = camera;
    }

}
